
public class Drink {

    public static void main(String[] args) {

        Drink[] drinks = new Drink[3];

        drinks[0] = new Drink("Mojito", 10.5);
        drinks[1] = new Drink("Gin", 5.4);
        drinks[2] = new Drink("Soda", 1.1);

        int size = drinks.length;

        for (int member = 0; member < size; ++member) {
            System.out.print(drinks[member].getName() + ": " + drinks[member].getPrice() + "\n");
        }

    }

    private String name;

    private double price;

    public Drink(String name, double price) {
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
    
}
