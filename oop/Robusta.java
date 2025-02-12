
public class Robusta extends Coffee {

    @Override
    public void info() {
        System.out.println("robusta's name: " + super.name);
        System.out.println("robusta's price: " + super.price);
        System.out.println("robusta's origin: " + super.origin);
        System.out.println("robusta's appearance: " + super.appearance);
        System.out.println("robusta's flavour: " + super.flavour);
        System.out.println("robusta's caffeine content: " + super.caffeineContent);
        System.out.println("robusta's plant growth: " + super.plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("robusta is being roasted");
    }

}
