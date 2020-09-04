package refactoring.after.primitive_obsession;

public class ToyLength {
	private int length;
	private String unit;

	public ToyLength() {
	}

	public ToyLength(int length, String unit) {
		this.length = length;
		this.unit = unit;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	int getLengthofCentimeter() {
		if ("m".equalsIgnoreCase(getUnit())) {
	        return getLength() * 100;
	    }

	    return getLength();
	}
}
