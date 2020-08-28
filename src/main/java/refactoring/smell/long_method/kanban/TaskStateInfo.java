package refactoring.smell.long_method.kanban;

import java.util.List;

public class TaskStateInfo {
    private String id;
    private String name;
    private Long sequence;
    private List<TaskStateInfo> nextStates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public List<TaskStateInfo> getNextStates() {
        return nextStates;
    }

    public void setNextStates(List<TaskStateInfo> nextStates) {
        this.nextStates = nextStates;
    }

}
