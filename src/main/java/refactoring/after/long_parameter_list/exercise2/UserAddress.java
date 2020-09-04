package refactoring.after.long_parameter_list.exercise2;

public class UserAddress {
	private String areaCode;
	private String city;
	private String street;
	private String address;
	private String phoneNo;

	public UserAddress(String areaCode, String city, String street, String address, String phoneNo) {
		this.areaCode = areaCode;
		this.city = city;
		this.street = street;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
}
