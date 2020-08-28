package refactoring.smell.refused_bequest;

/**
 * @author meixuesong
 */
public class SalesManager extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return quota < 5000;
    }
}
