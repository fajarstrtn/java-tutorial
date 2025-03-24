
public class CoffeeFactory {

    public static void main(String[] args) {

        Coffee arabica = new Arabica();
        arabica.name = "Coffea Arabica";
        arabica.price = 100D;
        arabica.origin = "Ethiopia";
        arabica.appearance = "Oval-shaped beans with a curved crease";
        arabica.flavour = "Sweeter, smoother, and more acidic with fruity and floral notes";
        arabica.caffeineContent = "1.2% - 1.5% caffeine";
        arabica.plantGrowth = "Grows best at high altitudes (600-2000m), requires cooler temperatures (15-24°C), and is more susceptible to diseases";
        arabica.inform();
        arabica.roast();

        Coffee robusta = new Robusta();
        robusta.name = "Coffea Canephora";
        robusta.price = 50D;
        robusta.origin = "Central Africa";
        robusta.appearance = "Smaller and rounder beans with a straight crease";
        robusta.flavour = "Stronger, bitter, and earthy with nutty and woody flavors";
        robusta.caffeineContent = "2.2% - 2.7% caffeine";
        robusta.plantGrowth = "Thrives at lower altitudes (200-800m), withstands higher temperatures (24-30°C), and is more resistant to pests and diseases";
        robusta.inform();
        robusta.roast();

    }

}
