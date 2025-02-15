
public class Arabica extends Coffee {

    @Override
    public void inform() {
        System.out.println("arabica's name: " + name);
        System.out.println("arabica's price: " + price);
        System.out.println("arabica's origin: " + origin);
        System.out.println("arabica's appearance: " + appearance);
        System.out.println("arabica's flavour: " + flavour);
        System.out.println("arabica's caffeine content: " + caffeineContent);
        System.out.println("arabica's plant growth: " + plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("arabica coffee bean is being roasted");
    }

}
