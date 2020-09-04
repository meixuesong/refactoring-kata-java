package refactoring.after.data_clumps;

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
