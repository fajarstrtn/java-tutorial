
public class Arabica extends Coffee {

    @Override
    public void inform() {
        System.out.println("Arabica's name: " + name);
        System.out.println("Arabica's price: " + price);
        System.out.println("Arabica's origin: " + origin);
        System.out.println("Arabica's appearance: " + appearance);
        System.out.println("Arabica's flavour: " + flavour);
        System.out.println("Arabica's caffeine content: " + caffeineContent);
        System.out.println("Arabica's plant growth: " + plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("Arabica coffee bean is being roasted");
    }

}
