package refactoring.smell.refused_bequest;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalesManagerTest {
    @Test
    public void should_have_quota_less_than_5000() {
        SalesManager manager = new SalesManager();

        assertTrue(manager.hasSalesQuota(2000));
        assertFalse(manager.hasSalesQuota(5000));
        assertFalse(manager.hasSalesQuota(5001));
    }

}