package refactoring.after.refused_bequest;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Salesman extends Employee {

    public boolean hasSalesQuota(int quota) {
        return quota < 1000;
    }
}
