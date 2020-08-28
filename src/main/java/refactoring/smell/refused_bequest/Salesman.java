package refactoring.smell.refused_bequest;

/**
 * @author meixuesong
 */
public class Salesman extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return quota < 1000;
    }
}
