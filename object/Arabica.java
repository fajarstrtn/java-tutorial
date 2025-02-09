
public class Arabica extends Coffee {

    @Override
    public void info() {
        System.out.println("arabica's name: " + super.name);
        System.out.println("arabica's price: " + super.price);
        System.out.println("arabica's origin: " + super.origin);
        System.out.println("arabica's appearance: " + super.appearance);
        System.out.println("arabica's flavour: " + super.flavour);
        System.out.println("arabica's caffeine content: " + super.caffeineContent);
        System.out.println("arabica's plant growth: " + super.plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("arabica coffee bean is being roasted");
    }

}
