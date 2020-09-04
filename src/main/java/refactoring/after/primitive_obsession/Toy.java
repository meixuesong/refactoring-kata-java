package refactoring.after.primitive_obsession;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Toy {
    private String type;
    private ToyLength length;

	public Toy(String type, int length, String unit) {
        this.type = type;
        this.length = new ToyLength(length, unit);
    }


    public int length() {
        return length.getLengthofCentimeter();
    }
}
