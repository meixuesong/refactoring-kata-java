package refactoring.after.duplicated_code;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Employee {
    private final String type;
    private final String name;

    public Employee(String type, String name) {

        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
