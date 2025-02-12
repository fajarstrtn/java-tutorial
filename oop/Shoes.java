
public class Shoes {

    private String name;

    private Double price;

    private String type;

    private String color;

    private Boolean isBrandNew;

    public Shoes() {
    }

    public Shoes(String color, Boolean isBrandNew, String name, Double price, String type) {
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

    public Boolean getIsBrandNew() {
        return isBrandNew;
    }

    public void setIsBrandNew(Boolean isBrandNew) {
        this.isBrandNew = isBrandNew;
    }

    public void getInformation(String name) {

/*      use "this" keyword when dealing with variable shadowing.
        System.out.println("hello, " + name + "! you just bought a " + name + " " + type + " shoes"); */
        System.out.println("hello, " + name + "! you just bought a " + this.name + " " + type + " shoes");

    }

    public static void main(String[] args) {

        var nike = new Shoes();

        nike.setName("nike air jordan");
        nike.setPrice(320D);
        nike.setType("sneaker");
        nike.setColor("off-white");
        nike.setIsBrandNew(true);

        nike.getInformation("yvone");

    }

}
