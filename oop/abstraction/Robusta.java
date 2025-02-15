
public class Robusta extends Coffee {

    @Override
    public void inform() {
        System.out.println("robusta's name: " + name);
        System.out.println("robusta's price: " + price);
        System.out.println("robusta's origin: " + origin);
        System.out.println("robusta's appearance: " + appearance);
        System.out.println("robusta's flavour: " + flavour);
        System.out.println("robusta's caffeine content: " + caffeineContent);
        System.out.println("robusta's plant growth: " + plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("robusta is being roasted");
    }

}
