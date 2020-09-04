package refactoring.smell.feature_envy;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Customer {
    private String name;
    private Phone mobilePhone;

    public Customer(String name, Phone mobilePhone) {
        this.name = name;
        this.mobilePhone = mobilePhone;
    }

    public String getNameAndPhone() {
        return name + "(" +
                mobilePhone.getAreaCode() + ")" +
                mobilePhone.getPrefix() + "-" +
                mobilePhone.getNumber();
    }
}
