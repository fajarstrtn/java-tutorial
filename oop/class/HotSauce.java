
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class HotSauce {

    private static final Logger logger = System.getLogger(HotSauce.class.getName());

    private String name;
    private Double size;
    private Double price;

    public HotSauce(String name, Double size, Double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public HotSauce(String name, Double size) {
        this(name, size, 0D);
    }

    public HotSauce(String name) {
        this(name, 0D);
    }

    public HotSauce() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String print() {
        return "It\'s a " + name + " hot sauce."
                + " It\'s " + size + " ml."
                + " It costs $" + price;
    }

    public String print(String customerName) {
        return "Hi, " + customerName + "!"
                + " " + name + " is our new main product."
                + " It has " + size + " ml."
                + " It costs only $" + price + ".";
    }

    public static void main(String[] args) {
        var sriracha = new HotSauce();
        sriracha.setName("Sriracha");
        sriracha.setSize(250D);
        sriracha.setPrice(1.5D);
        logger.log(Level.INFO, sriracha.print());

        var tabasco = new HotSauce("Tabasco", 500D, 1.1D);
        logger.log(Level.INFO, tabasco.print("John Doe"));

        var heinz = new HotSauce("Cholula");
        logger.log(Level.INFO, heinz.print());
    }

}
