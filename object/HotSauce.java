
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

    public void setName(String name) {

        this.name = name;

    }

    public void setSize(Double size) {

        this.size = size;

    }

    public void setPrice(Double price) {

        this.price = price;

    }

    public String getName() {

        return name;

    }

    public Double getSize() {

        return size;

    }

    public Double getPrice() {

        return price;

    }

    public String print() {

        return "it is a " + this.name + " hot sauce. it is " + this.size + " ml and it costs $" + this.price + ".";

    }

    public static void main(String[] args) {

        var sriracha = new HotSauce();

        sriracha.setName("sriracha");
        sriracha.setSize(250D);
        sriracha.setPrice(1.5D);

        logger.log(Level.INFO, sriracha.print());

        var tabasco = new HotSauce("tabasco", 500D, 1.1D);

        logger.log(Level.INFO, tabasco.print());

        var redhot = new HotSauce("frank's redhot", 750D);

        logger.log(Level.INFO, redhot.print());

        var heinz = new HotSauce("cholula");

        logger.log(Level.INFO, heinz.print());

    }

}
