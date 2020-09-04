package refactoring.after.switch_statement;

public class EngineerFactory {
	public static final String FULL_STACK = "FullStack";
	public static final String FRONTEND = "Frontend";
	public static final String BACKEND = "Backend";

	public static Engineer createEngineer(String type) {
        if (EngineerFactory.FULL_STACK.equals(type)) {
        	return createFullstackEngineer();
        } else if (EngineerFactory.BACKEND.equals(type)) {
        	return createBackendEngineer();
        } else if (EngineerFactory.FRONTEND.equals(type)) {
        	return createFrontendEngineer();
        } else {
        	throw new UnsupportedOperationException("Type not supported");
        }
	}

    private static Engineer createBackendEngineer() {
    	return new Engineer(EngineerFactory.BACKEND, new BackendCompetenceStrategy());
    }

    private static Engineer createFrontendEngineer() {
    	return new Engineer(EngineerFactory.FRONTEND, new FrontendCompetenceStrategy());
    }

    private static Engineer createFullstackEngineer() {
    	return new Engineer(EngineerFactory.FULL_STACK, new FullstackCompetenceStrategy());
    }

}
