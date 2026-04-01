
public class Beverage {

    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.price;
    }

    public static void main(String[] args) {
        // Array declaration is generally static, but if the size in not defined, the array is dynamically sized.
        Beverage[] beverages = new Beverage[3];

        /*
         * Uncomment this will cause an error.
         *
         * Syntax:
         * beverages[3] = new Beverage("Gin", 1.5); */
        beverages[0] = new Beverage("Whiskey", 10.5);
        beverages[1] = new Beverage("Vodka", 5.4);
        beverages[2] = new Beverage("Ginger Ale", 1.1);

        // Loop through beverages and print using toString() method.
        for (Beverage beverage : beverages) {
            System.out.println(beverage);
        }
    }

}
