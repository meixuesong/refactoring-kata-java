package refactoring.smell.duplicated_code;


import java.util.ArrayList;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EmployeeFinder {

    public static final String ENGINEER = "ENGINEER";
    public static final String ADMINISTRATOR = "ADMINISTRATOR";
    private List<Employee> employees;

    public EmployeeFinder(List<Employee> employees) {
        this.employees = employees;
    }

    List<String> findEngineerNames() {
        List<String> results = new ArrayList<>();
        for (Employee employee : employees) {
            if (ENGINEER.equalsIgnoreCase(employee.getType())) {
                results.add(employee.getName());
            }
        }

        return results;
    }

    List<String> findAdministratorNames() {
        List<String> results = new ArrayList<>();
        for (Employee employee : employees) {
            if (ADMINISTRATOR.equalsIgnoreCase(employee.getType())) {
                results.add(employee.getName());
            }
        }

        return results;
    }

}
