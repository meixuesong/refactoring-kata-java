package refactoring.smell.refused_bequest;

public class Salesman extends Employee {
    @Override
    public boolean hasSalesQuota(int quota) {
        return quota < 1000;
    }
}
