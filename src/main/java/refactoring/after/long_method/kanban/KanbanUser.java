package refactoring.after.long_method.kanban;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class KanbanUser {
    private String loginCode;
    private String name;
    private String avatar;

    public KanbanUser(User user) {
    	setLoginCode(user.getLoginCode());
        setName(user.getName());
        setAvatar(user.getAvatar());
	}

	public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
