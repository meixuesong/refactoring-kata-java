package refactoring.after.data_class;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class UserService {

    public void changeAddress(User user, String fullAddress) {
		user.changeAddress(fullAddress);
	}
}
