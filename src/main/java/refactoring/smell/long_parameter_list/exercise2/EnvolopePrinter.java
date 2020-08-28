package refactoring.smell.long_parameter_list.exercise2;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EnvolopePrinter {
    //TODO: 参数过长
    public String printEnvolope(String firstName, String lastName, String areaCode, String city, String street, String address, String phoneNo) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", firstName, lastName, areaCode, city, street, address, phoneNo);
    }
}
