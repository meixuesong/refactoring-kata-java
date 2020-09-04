package refactoring.after.switch_statement;

public class BackendCompetenceStrategy extends CompetenceStrategy {

	@Override
	public double getCompetenceValue(Engineer engineer, double unit) {
		double craftSkill = unit * 0.8;
		double softSkill = craftSkill * 0.1;

		return craftSkill + softSkill;
	}

}
