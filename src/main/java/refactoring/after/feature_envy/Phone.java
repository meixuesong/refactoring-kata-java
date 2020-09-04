package refactoring.after.feature_envy;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Phone {
    private final String unformattedNumber;

    public Phone(String unformattedNumber) {
        this.unformattedNumber = unformattedNumber;
    }

    public String getAreaCode() {
        return unformattedNumber.substring(0, 3);
    }

    public String getPrefix() {
        return unformattedNumber.substring(3, 6);
    }

    public String getNumber() {
        return unformattedNumber.substring(6, 10);
    }

	String getFormatedPhone() {
		String formatedPhone = "(" +
		                getAreaCode() + ")" +
		                getPrefix() + "-" +
		                getNumber();

		return formatedPhone;
	}
}
