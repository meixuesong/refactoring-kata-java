package refactoring.smell.long_method.kanban;

import java.util.List;

public class Kanban {
    private List<KanbanUser> users;
    private List<KanbanColumn> columns;

    public void setUsers(List<KanbanUser> users) {
        this.users = users;
    }

    public List<KanbanUser> getUsers() {
        return users;
    }

    public void setColumns(List<KanbanColumn> columns) {
        this.columns = columns;
    }

    public List<KanbanColumn> getColumns() {
        return columns;
    }
}
