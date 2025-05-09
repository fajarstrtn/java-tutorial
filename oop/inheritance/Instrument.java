
public class Instrument {

    protected String name;
    protected String brand;
    protected String type;
    protected String material;
    protected double price;
    protected boolean isTuned;

    public Instrument() {
        // no-args constructor
    }

    public Instrument(String brand, String material, String name, double price, String type) {
        this.brand = brand;
        this.isTuned = false;
        this.material = material;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void play() {
        System.out.println("Someone is playing a " + name + ".");
    }

    public void tune() {
        isTuned = true;
        System.out.println(name + " is successfuly tuned.");
    }

}
