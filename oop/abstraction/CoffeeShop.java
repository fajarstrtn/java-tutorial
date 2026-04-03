/*
 * An abstract class should have at least one abstract method.
 * It has no body and abstract method needs to override (its subclasses). */
abstract class Coffee {

    public String name;
    public String origin;
    public String appearance;
    public String flavour;
    public String caffeineInfo;
    public String plantGrowth;
    public Double price;

    public abstract void getInfo();

    public abstract void roast();

}

class Arabica extends Coffee {

    @Override
    public void getInfo() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(origin);
        System.out.println(appearance);
        System.out.println(flavour);
        System.out.println(caffeineInfo);
        System.out.println(plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("Arabica beans are being roasted");
    }

}

class Robusta extends Coffee {

    @Override
    public void getInfo() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(origin);
        System.out.println(appearance);
        System.out.println(flavour);
        System.out.println(caffeineInfo);
        System.out.println(plantGrowth);
    }

    @Override
    public void roast() {
        System.out.println("Robusta beans are being roasted");
    }

}

public class CoffeeShop {

    public static void main(String[] args) {
        Coffee arabica = new Arabica();
        arabica.name = "Coffea Arabica";
        arabica.price = 100D;
        arabica.origin = "Ethiopia";
        arabica.appearance = "Oval-shaped beans with a curved crease";
        arabica.flavour = "Sweeter, smoother, and more acidic with fruity and floral notes";
        arabica.caffeineInfo = "1.2% - 1.5% caffeine";
        arabica.plantGrowth
                = "Grows best at high altitudes (600-2000m),"
                + " requires cooler temperatures (15-24°C),"
                + " and is more susceptible to diseases";
        arabica.getInfo();
        arabica.roast();

        Coffee robusta = new Robusta();
        robusta.name = "Coffea Canephora";
        robusta.price = 50D;
        robusta.origin = "Central Africa";
        robusta.appearance = "Smaller and rounder beans with a straight crease";
        robusta.flavour = "Stronger, bitter, and earthy with nutty and woody flavors";
        robusta.caffeineInfo = "2.2% - 2.7% caffeine";
        robusta.plantGrowth
                = "Thrives at lower altitudes (200-800m),"
                + " withstands higher temperatures (24-30°C),"
                + " and is more resistant to pests and diseases";
        robusta.getInfo();
        robusta.roast();
    }

}
