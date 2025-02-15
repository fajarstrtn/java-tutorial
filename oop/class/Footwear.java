
public class Footwear {

    private static final String FOOTWEAR_MANUFACTURER = "edward kennedy international";
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

    public void inform(String name) {
        /* Variable shadowing can be fix with using "this" keyword. it refers to instance's attribute or method
        rather than parameter. */
        System.out.println("hello, " + name + "! you just bought a " + this.name + " " + type + " shoes");
    }

    /* Since static attributes or methods belong to the class, then non-static variable name cannot be referenced from a static context. */
    public static void getManufacturerInformation() {
        System.out.println(FOOTWEAR_MANUFACTURER);
    }

    public static void main(String[] args) {

        var nike = new Footwear();
        nike.setName("nike air jordan");
        nike.setPrice(320D);
        nike.setType("sneaker");
        nike.setColor("off-white");
        nike.isBrandNew(true);
        nike.inform("yvone");

        Footwear.getManufacturerInformation();

    }

}
