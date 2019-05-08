package refactoring.smell.refused_bequest;

public class SalesManager extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return quota < 5000;
    }
}
