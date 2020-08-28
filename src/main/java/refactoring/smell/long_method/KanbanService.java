package refactoring.smell.long_method;

import com.sun.tools.javac.util.Assert;
import org.apache.commons.lang3.StringUtils;
import refactoring.smell.long_method.kanban.ColumnService;
import refactoring.smell.long_method.kanban.Kanban;
import refactoring.smell.long_method.kanban.KanbanColumn;
import refactoring.smell.long_method.kanban.KanbanUser;
import refactoring.smell.long_method.kanban.QueryBuilder;
import refactoring.smell.long_method.kanban.QueryService;
import refactoring.smell.long_method.kanban.TaskInfo;

import java.util.ArrayList;
import java.util.List;

public class KanbanService {
    private ColumnService columnService;
    private QueryService queryService;

    public KanbanService(ColumnService columnService, QueryService queryService) {
        this.columnService = columnService;
        this.queryService = queryService;
    }

    /**
     * 查询某个团队的任务看板。
     * @param search 搜索关键字
     * @param teamId 团队ID
     * @return 该团队的看板
     */
    public Kanban query(String search,
                        String teamId) {
        Assert.checkNonNull(teamId, "Team can not be null");
        Kanban kanban = new Kanban();
        //查询该团队有哪些任务状态，每个状态对应看板的一列。
        List<TaskInfo> states = columnService.getTaskStatesByTeamId(teamId);
        List<KanbanColumn> columns = new ArrayList<>();
        for (TaskInfo state : states) {
            KanbanColumn column = new KanbanColumn();
            column.setStateId(state.getId());
            column.setName(state.getName());
            column.setSequence(state.getSequence());
            column.setTasks(new ArrayList<>());
            columns.add(column);
        }
        QueryBuilder queryBuilder = new QueryBuilder();
        if (StringUtils.isNotEmpty(search)) {
            queryBuilder.should().match("summary", search);
            queryBuilder.should().match("description", search);
        }
        queryBuilder.filter().term("teamId", teamId).term("achieved", "FALSE");
        //查询符合条件的任务
        List<TaskInfo> taskList = queryService.queryDocs("TASKS", queryBuilder, 1, 10000, TaskInfo.class);
        List<KanbanUser> users = new ArrayList<>();
        for (TaskInfo task : taskList) {
            if (task.getAssignToUser() != null) {
                KanbanUser kanbanUser = new KanbanUser();
                kanbanUser.setLoginCode(task.getAssignToUser().getLoginCode());
                kanbanUser.setName(task.getAssignToUser().getName());
                kanbanUser.setAvatar(task.getAssignToUser().getAvatar());
                users.add(kanbanUser);
            }
            //将任务加到看板对应的列中。
            for (KanbanColumn column : columns) {
                if (column.getStateId().equals(task.getState().getId())) {
                    column.getTasks().add(task);
                }
            }
        }
        kanban.setUsers(users);
        kanban.setColumns(columns);

        return kanban;
    }
}
