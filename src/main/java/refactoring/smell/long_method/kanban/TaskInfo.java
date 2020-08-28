package refactoring.smell.long_method.kanban;

/**
 * @author meixuesong
 */
public class TaskInfo {
    private User assignToUser;
    private String id;
    private TaskStateInfo state;
    private String name;
    private Long sequence;

    public User getAssignToUser() {
        return assignToUser;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public TaskStateInfo getState() {
        return state;
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
}
