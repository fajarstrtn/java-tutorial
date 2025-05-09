
public class Guitar extends Instrument {

    public int stringTotal;

    public Guitar() {
        super();
    }

    public Guitar(int stringTotal, String brand, String material, String name, double price, String type) {
        super(brand, material, name, price, type);
        this.stringTotal = stringTotal;
    }

    public void strum() {
        System.out.println(name + "is being strummed.");
    }

    public void changeString(int stringTotal) {
        int oldStringTotal = this.stringTotal;
        this.stringTotal = stringTotal;
        System.out.println("Strings have been changed from " + oldStringTotal + " to " + this.stringTotal + ".");
    }

}
