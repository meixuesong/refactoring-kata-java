package refactoring.after.long_method;

import org.apache.commons.lang3.StringUtils;
import refactoring.after.long_method.kanban.KanbanColumn;
import refactoring.after.long_method.kanban.QueryBuilder;
import refactoring.after.long_method.kanban.TaskInfo;
import refactoring.after.long_method.kanban.ColumnService;
import refactoring.after.long_method.kanban.Kanban;
import refactoring.after.long_method.kanban.KanbanUser;
import refactoring.after.long_method.kanban.QueryService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
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
    public Kanban query(String search, String teamId) {
        if (teamId == null) {
            throw new IllegalArgumentException("Team can not be null");
        }
        List<TaskInfo> taskList = findTasks(search, teamId);

        List<KanbanUser> users = getKanbanUsers(taskList);
        List<KanbanColumn> columns = createKanbanColumns(teamId);
        assignTasksToColumns(columns, taskList);

        return new Kanban(columns, users);
    }

	private void assignTasksToColumns(List<KanbanColumn> columns, List<TaskInfo> taskList) {
		for (KanbanColumn column : columns) {
			column.addTasksToColumn(taskList);
        }
	}

	private List<KanbanUser> getKanbanUsers(List<TaskInfo> taskList) {
		List<KanbanUser> users = new ArrayList<>();
        for (TaskInfo task : taskList) {
            if (task.getAssignToUser() == null) {
            	continue;
            }

            users.add(new KanbanUser(task.getAssignToUser()));
        }

		return users;
	}

	private List<TaskInfo> findTasks(String search, String teamId) {
		QueryBuilder queryBuilder = new QueryBuilder();
        if (StringUtils.isNotEmpty(search)) {
            queryBuilder.should().match("summary", search);
            queryBuilder.should().match("description", search);
        }
        queryBuilder.filter().term("teamId", teamId).term("achieved", "FALSE");
        List<TaskInfo> taskList = queryService.queryDocs("TASKS", queryBuilder, 1, 10000, TaskInfo.class);

		return taskList;
	}

	private List<KanbanColumn> createKanbanColumns(String teamId) {
        List<TaskInfo> states = columnService.getTaskStatesByTeamId(teamId);
        List<KanbanColumn> columns = new ArrayList<>();
        for (TaskInfo state : states) {
            columns.add(new KanbanColumn(state));
        }

		return columns;
	}
}
