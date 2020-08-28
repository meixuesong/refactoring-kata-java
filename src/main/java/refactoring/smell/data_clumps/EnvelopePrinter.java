package refactoring.smell.data_clumps;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EnvelopePrinter {
    public String printEnvelope(String firstName, String lastName, String areaCode, String city, String street, String address, String phoneNo) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", firstName, lastName, areaCode, city, street, address, phoneNo);
    }
}
