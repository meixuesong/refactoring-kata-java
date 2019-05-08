package refactoring.smell.feature_envy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void should_get_customer_name_and_address() {
        Phone phone = new Phone("01055588888");
        Customer customer = new Customer("Li", phone);

        assertEquals("", customer.getNameAndPhone());
    }
}