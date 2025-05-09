
public class Robusta extends Coffee {

    @Override
    public void inform() {
        System.out.println("Robusta's name: " + name);
        System.out.println("Robusta's price: " + price);
        System.out.println("Robusta's origin: " + origin);
        System.out.println("Robusta's appearance: " + appearance);
        System.out.println("Robusta's flavour: " + flavour);
        System.out.println("Robusta's caffeine content: " + caffeineContent);
        System.out.println("Robusta's plant growth: " + plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("Robusta is being roasted.");
    }

}
