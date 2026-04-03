
public class Footwear {

    private static final String FOOTWEAR_MANUFACTURER = "Edward Kennedy International";

    private String name;
    private Double price;
    private String type;
    private String color;
    private Boolean isBrandNew;

    public Footwear() {
    }

    public Footwear(String color, Boolean isBrandNew, String name, Double price, String type) {
        this.color = color;
        this.isBrandNew = isBrandNew;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isBrandNew() {
        return isBrandNew;
    }

    public void isBrandNew(Boolean isBrandNew) {
        this.isBrandNew = isBrandNew;
    }

    /*
     * Variable shadowing can be fix with using "this" keyword.
     * It refers to instance's attribute or method rather than parameter. */
    public void inform(String name) {
        System.out.println("Hi, " + name + "! You just bought a " + this.name + " " + type + " shoes");
    }

    /*
     * Since static attributes or methods belong to the class,
     * non-static variable name cannot be referenced from a static context. */
    public static void getManufacturerInformation() {
        System.out.println(FOOTWEAR_MANUFACTURER);
    }

    public static void main(String[] args) {
        var product = new Footwear();
        product.setName("Nike Air Jordan");
        product.setPrice(320D);
        product.setType("Sneakers");
        product.setColor("Off-White");
        product.isBrandNew(true);
        product.inform("John Doe");
        Footwear.getManufacturerInformation();
    }

}
