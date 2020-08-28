package refactoring.smell.refused_bequest;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Engineer extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        throw new UnsupportedOperationException("Engineer has no sales quota");
    }
}
