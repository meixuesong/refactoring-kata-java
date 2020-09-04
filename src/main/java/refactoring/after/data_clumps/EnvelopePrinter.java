package refactoring.after.data_clumps;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class EnvelopePrinter {
    public String printEnvelope(UserName userName, UserAddress userAddress) {
        return String.format("%s, %s\n (%s) %s\n%s, %s, %s", userName.getFirstName(), userName.getLastName(),
        		userAddress.getAreaCode(), userAddress.getCity(), userAddress.getStreet(),
        		userAddress.getAddress(), userAddress.getPhoneNo());
    }
}
