package refactoring.after.magic_number;

public enum StatusEnum {
	DEACTIVE(0),
	ACTIVE(1),;

	StatusEnum(int value) {
		this.value = value;
	}

	private final int value;

	public int getValue() {
		return value;
	}

}
