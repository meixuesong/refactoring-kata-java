package refactoring.smell.data_clumps;

/**
 * @author meixuesong
 */
public class EnvelopePrinter {
    public String printEnvelope(String firstName, String lastName, String areaCode, String city, String street, String address, String phoneNo) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", firstName, lastName, areaCode, city, street, address, phoneNo);
    }
}
