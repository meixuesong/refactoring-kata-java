package refactoring.smell.duplicated_code;

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
