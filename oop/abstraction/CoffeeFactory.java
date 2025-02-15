
public class CoffeeFactory {

    public static void main(String[] args) {

        Coffee arabica = new Arabica();

        arabica.name = "coffea arabica";
        arabica.price = 100D;
        arabica.origin = "ethiopia";
        arabica.appearance = "oval-shaped beans with a curved crease";
        arabica.flavour = "sweeter, smoother, and more acidic with fruity and floral notes";
        arabica.caffeineContent = "1.2% - 1.5% caffeine";
        arabica.plantGrowth = "grows best at high altitudes (600-2000m), requires cooler temperatures (15-24°C), and is more susceptible to diseases";

        arabica.inform();
        arabica.roast();

        Coffee robusta = new Robusta();

        robusta.name = "coffea canephora";
        robusta.price = 50D;
        robusta.origin = "central africa";
        robusta.appearance = "smaller and rounder beans with a straight crease";
        robusta.flavour = "stronger, bitter, and earthy with nutty and woody flavors";
        robusta.caffeineContent = "2.2% - 2.7% caffeine";
        robusta.plantGrowth = "thrives at lower altitudes (200-800m), withstands higher temperatures (24-30°C), and is more resistant to pests and diseases";

        robusta.inform();
        robusta.roast();

    }

}
