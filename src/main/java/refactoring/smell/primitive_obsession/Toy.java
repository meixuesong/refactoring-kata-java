package refactoring.smell.primitive_obsession;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class Toy {
    private String type;
    private int length;
    private String unit;

    public Toy(String type, int length, String unit) {
        this.type = type;
        this.length = length;
        this.unit = unit;
    }


    public int length() {
        if ("m".equalsIgnoreCase(unit)) {
            return length * 100;
        }

        return length;
    }
}
