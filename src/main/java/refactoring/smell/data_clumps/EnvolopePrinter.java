package refactoring.smell.data_clumps;

public class EnvolopePrinter {
    public String printEnvolope(String firstName, String lastName, String areaCode, String city, String street, String address, String phoneNo) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", firstName, lastName, areaCode, city, street, address, phoneNo);
    }
}
