package refactoring.smell.duplicated_code;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class EmployeeFinderTest {

    @Test
    public void should_return_names() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(EmployeeFinder.ENGINEER, "Jason1"));
        employees.add(new Employee(EmployeeFinder.ENGINEER, "Jason2"));
        employees.add(new Employee(EmployeeFinder.ENGINEER, "Jason3"));
        employees.add(new Employee(EmployeeFinder.ENGINEER, "Jason4"));
        employees.add(new Employee(EmployeeFinder.ADMINISTRATOR, "Admin1"));
        employees.add(new Employee(EmployeeFinder.ADMINISTRATOR, "Admin2"));
        employees.add(new Employee(EmployeeFinder.ADMINISTRATOR, "Admin3"));
        employees.add(new Employee(EmployeeFinder.ADMINISTRATOR, "Admin4"));
        employees.add(new Employee(EmployeeFinder.ADMINISTRATOR, "Admin5"));

        EmployeeFinder finder = new EmployeeFinder(employees);

        assertThat(finder.findEngineerNames()).hasSize(4);
        assertThat(finder.findAdministratorNames()).hasSize(5);
    }
}