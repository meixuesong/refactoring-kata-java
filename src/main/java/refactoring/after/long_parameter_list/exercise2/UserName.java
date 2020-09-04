package refactoring.after.long_parameter_list.exercise2;

public class UserName {
	public String firstName;
	public String lastName;

	public UserName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
