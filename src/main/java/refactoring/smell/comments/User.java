package refactoring.smell.comments;

/**
 * @author meixuesong
 */
//TODO: 请修复注释坏味道
public class User {
    private String name1; //first name
    private String name2; //last name

    //获取完整姓名
    public String getFullName() {
        return name1 + " " + name2;
    }
}
