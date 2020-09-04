package refactoring.after.long_parameter_list.exercise2;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EnvolopePrinter {
    public String printEnvolope(UserName userName, UserAddress userAddress) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", userName.getFirstName(), userName.getLastName(),
        		userAddress.getAreaCode(), userAddress.getCity(), userAddress.getStreet(), userAddress.getAddress(), userAddress.getPhoneNo());
    }
}
