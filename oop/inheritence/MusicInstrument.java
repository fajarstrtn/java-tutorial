
class Instrument {

    protected String name;
    protected String brand;
    protected String type;
    protected String material;
    protected double price;
    protected boolean isTuned;

    public Instrument() {
    }

    public Instrument(String brand, String material, String name, double price, String type) {
        this.brand = brand;
        this.isTuned = false;
        this.material = material;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public void tune() {
        isTuned = true;
        System.out.println(name + " is being tuned");
    }

    public void play() {
        System.out.println(name + " is being played");
    }

}

class Guitar extends Instrument {

    public String color;

    public Guitar() {
        super();
    }

    public Guitar(String color, String brand, String material, String name, double price, String type) {
        super(brand, material, name, price, type);
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println(name + " is being played using pick");
    }

    public void repaint(String color) {
        System.out.println(name + " is being repainted from " + this.color + " to " + color);
    }

}

public class MusicInstrument {

    public static void main(String[] args) {
        Guitar guitar = new Guitar();

        guitar.name = "Telecaster";
        guitar.brand = "Fender";
        guitar.type = "Electric Guitar";
        guitar.material = "Rosewood";
        guitar.price = 5_000;
        guitar.isTuned = false;
        guitar.color = "Yellow-Black";

        guitar.tune();
        guitar.play();
        guitar.repaint("Jet Black");

        Instrument ukulele = new Guitar();

        ukulele.name = "Kamaka HF-2";
        ukulele.brand = "Kamaka";
        ukulele.type = "Ukulele";
        ukulele.material = "Solid Koa Wood";
        ukulele.price = 1_000;
        ukulele.isTuned = false;

        /*
         * Method access is determined by the reference type
         * at compile time not the object type.
         * 
         * Uncomment this will cause an error.
         * 
         * Syntax:
         * ukulele.repaint(); */
        ukulele.tune();
        ukulele.play();
        ((Guitar) ukulele).repaint("Blue");
    }

}
