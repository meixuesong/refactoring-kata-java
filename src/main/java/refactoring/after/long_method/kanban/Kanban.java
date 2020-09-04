package refactoring.after.long_method.kanban;

import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Kanban {
    private List<KanbanUser> users;
    private List<KanbanColumn> columns;

    public Kanban(List<KanbanColumn> columns, List<KanbanUser> users) {
    	this.columns = columns;
    	this.users = users;
	}

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
