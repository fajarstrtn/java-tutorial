
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.Function;

public class Restaurant {

    public static void order(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Reference to a Static Method: ClassName::staticMethodName.
        Consumer<String> orderMeal = Restaurant::order;
        orderMeal.accept("Calling waiter to order meal...");

        // Reference to an Instance Method of a Particular Object: object::instanceMethodName.
        var coffeeShop = new CoffeeShop();
        Consumer<String> orderCoffee = coffeeShop::order;
        orderCoffee.accept("Calling barista to order a cup of coffee...");

        // Reference to an Instance Method of an Arbitrary Object of a Particular Type: ClassName::instanceMethodName.
        // This form is used when the method is called on the object that is passed as a parameter to the lambda.
        var menu = Arrays.asList("Spanish Latte", "Americano", "Cappuccino", "Pandan Latte");
        menu.stream().forEach(System.out::println);

        // Reference to a Constructor: ClassName::new.
        // Used when we want to create a new object using a constructor, typically with a functional interface like Supplier or Function.
        Supplier<CoffeeShop> coffeeShopSupplier = CoffeeShop::new;
        CoffeeShop myCoffeeShop = coffeeShopSupplier.get();
        myCoffeeShop.order("Calling my own barista to order two shots of espresso...");

        String[] cafes = {"St. ALi", "Boil & Brew", "Tuku", "Little Langkah", "Biju"};
        Arrays.stream(cafes).forEach(System.out::println);

        List<String> merchandise = Arrays.asList("Cap", "T-Shirt", "Goody Bag", "Scrunchies");
        merchandise.sort(String::compareToIgnoreCase);
        System.out.println(merchandise);

        Supplier<List<Integer>> priceList = ArrayList::new;
        var list = priceList.get();
        System.out.println(list.size());

        ToIntFunction<String> converted = Integer::parseInt;
        int price = converted.applyAsInt("10000");
        double discount = price * (15 / 100.0);
        double finalPrice = price - discount;
        System.out.println("Final Price: " + finalPrice);

        Function<String, String> customer = myCoffeeShop::call;
        String info = customer.apply("James Dean");
        System.out.println(info);
    }

}

class CoffeeShop {

    private String name;
    private String address;
    private String theme;

    public CoffeeShop() {
        // No-args Constructor.
    }

    public CoffeeShop(String address, String name, String theme) {
        this.address = address;
        this.name = name;
        this.theme = theme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void order(String message) {
        System.out.println(message);
    }

    public String call(String customerName) {
        return "Hi, " + customerName + "! Please pick up your food here.";
    }

}
