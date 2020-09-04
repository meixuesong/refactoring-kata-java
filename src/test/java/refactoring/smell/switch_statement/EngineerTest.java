package refactoring.smell.switch_statement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

@RunWith(Parameterized.class)
public class EngineerTest {
    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        Object[][] data = new Object[][]{
                {"Backend", 1.2, 1.056},
                {"Backend", 2.2, 1.936},
                {"Frontend", 3.2, 2.464},
                {"FullStack", 8, 8.64},
        };

        return Arrays.asList(data);
    }

    public EngineerTest(String type, double unit, double result) {
        this.type = type;
        this.unit = unit;
        this.result = result;
    }

    private String type;
    private double unit;
    private double result;

    @Test
    public void should_calc_competence_value() {
        Engineer engineer = new Engineer(type);

        assertThat(engineer.getCompetenceValue(unit)).isCloseTo(result, offset(0.1));
    }
}
