package refactoring.smell.refused_bequest;

/**
 * @author meixuesong
 */
public class Engineer extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        throw new UnsupportedOperationException("Engineer has no sales quota");
    }
}
