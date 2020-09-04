package refactoring.after.data_clumps;

public class UserAddress {
	public String areaCode;
	public String city;
	public String street;
	public String address;
	public String phoneNo;

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
