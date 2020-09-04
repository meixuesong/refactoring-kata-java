package refactoring.after.switch_statement;


/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 * TODO: 使用策略模式重构getCompetenceValue方法
 */
public final class Engineer {
    private String type;
	private CompetenceStrategy competenceStrategy;

    Engineer(String type, CompetenceStrategy competenceStrategy) {
        this.competenceStrategy = competenceStrategy;
        this.type = type;
    }

    double getCompetenceValue(double unit) {
		return competenceStrategy.getCompetenceValue(this, unit);
    }

	public String getType() {
		return type;
	}
}
