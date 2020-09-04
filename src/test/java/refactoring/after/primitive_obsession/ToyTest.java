package refactoring.after.primitive_obsession;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToyTest {
    @Test
    public void should_compare_length() {
        Toy toy1 = new Toy("Car", 60, "cm");
        Toy toy2 = new Toy("Train", 1, "m");

        assertThat(toy2.length()).isGreaterThan(toy1.length());
    }
}
