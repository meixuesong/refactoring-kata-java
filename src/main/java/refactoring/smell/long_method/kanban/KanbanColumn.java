package refactoring.smell.long_method.kanban;

import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class KanbanColumn {
    private String stateId;
    private String name;
    private Long sequence;
    private List<TaskInfo> tasks;

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setTasks(List<TaskInfo> tasks) {
        this.tasks = tasks;
    }

    public List<TaskInfo> getTasks() {
        return tasks;
    }
}
