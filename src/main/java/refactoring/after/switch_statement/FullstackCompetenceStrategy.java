package refactoring.after.switch_statement;

public class FullstackCompetenceStrategy extends CompetenceStrategy {

	@Override
	public double getCompetenceValue(Engineer engineer, double unit) {
		double craftSkill = unit * 0.9;
		double softSkill = craftSkill * 0.2;

		return craftSkill + softSkill;
	}

}
