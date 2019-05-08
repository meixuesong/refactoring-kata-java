package refactoring.smell.data_clumps;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnvolopePrinterTest {

    @Test
    public void should_print_correct_envolope() {
        EnvolopePrinter printer = new EnvolopePrinter();
        String result = printer.printEnvolope("Xiaoming", "Li", "100007", "Beijing",
                "No.3 Dongzhimen South Street", "Room 1105, GuoHua Plaza", "18811111111");

        assertEquals("Xiaoming, Li\n" +
                " (100007) Beijing\n" +
                "No.3 Dongzhimen South Street, Room 1105, GuoHua Plaza, 18811111111", result);
    }

}