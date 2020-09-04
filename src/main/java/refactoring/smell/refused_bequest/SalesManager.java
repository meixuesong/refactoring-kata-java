package refactoring.smell.refused_bequest;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class SalesManager extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return quota < 5000;
    }
}
