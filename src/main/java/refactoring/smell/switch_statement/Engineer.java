package refactoring.smell.switch_statement;


/**
 * @author meixuesong
 */
public final class Engineer {
    public static final String FULL_STACK = "FullStack";
    public static final String FRONTEND = "Frontend";
    public static final String BACKEND = "Backend";
    private String type;

    public Engineer(String type) {
        if (!FULL_STACK.equals(type) && !FRONTEND.equals(type) && !BACKEND.equals(type)) {
            throw new UnsupportedOperationException("Type not supported");
        }

        this.type = type;
    }

    double getCompetenceValue(double unit) {
        if (BACKEND.equals(type)) {
            double craftSkill = unit * 0.8;
            double softSkill = craftSkill * 0.1;
            return craftSkill + softSkill;
        } else if (FRONTEND.equals(type)) {
            double craftSkill = unit * 0.7;
            double softSkill = craftSkill * 0.1;
            return craftSkill + softSkill;
        } else if (FULL_STACK.equals(type)) {
            double craftSkill = unit * 0.9;
            double softSkill = craftSkill * 0.2;
            return craftSkill + softSkill;
        } else {
            throw new UnsupportedOperationException("Type not recognized");
        }
    }
}
