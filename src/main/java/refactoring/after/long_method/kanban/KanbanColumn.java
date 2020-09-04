package refactoring.after.long_method.kanban;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class KanbanColumn {
    private String stateId;
    private String name;
    private Long sequence;
    private List<TaskInfo> tasks;

    public KanbanColumn(TaskInfo state) {
    	setStateId(state.getId());
        setName(state.getName());
        setSequence(state.getSequence());
        setTasks(new ArrayList<>());
	}

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

	public void addTasksToColumn(List<TaskInfo> taskList) {
		for (TaskInfo task : taskList) {
		    if (getStateId().equals(task.getState().getId())) {
		        getTasks().add(task);
		    }
		}
	}
}
