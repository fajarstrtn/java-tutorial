
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

public class Billboard {

    public static void iterate(List<String> customers, Consumer<String> printCustomer) {
        for (String customer : customers) {
            printCustomer.accept(customer);
        }
    }

    public static void main(String[] args) {
        Consumer<String> printAds = message -> System.out.println(message);
        printAds.accept("iPhone 16 here now!");

        Consumer<List<Integer>> printPriceTag = list -> {
            list.forEach(System.out::println);
        };

        List<Integer> price = new ArrayList<Integer>();
        price.add(10);
        price.add(50);
        price.add(150);
        price.add(350);
        price.add(500);
        printPriceTag.accept(price);

        Consumer<List<String>> printProducts = list -> list.stream().forEach(System.out::println);
        List<String> products = new ArrayList<String>();
        products.add("iPhone 16");
        products.add("Corkcicle");
        products.add("Steve Madden");
        printProducts.accept(products);

        Consumer<String> printLocations = location -> System.out.println("Normal :" + location);
        Consumer<String> printLocationsInUpperCase = location -> System.out.println("Upper Case: " + location.toUpperCase());
        Consumer<String> combination = printLocations.andThen(printLocationsInUpperCase);
        products.forEach(combination);

        List<String> customers = List.of("Jack Napalm", "Pandora", "Judy Nails");
        iterate(customers, customer -> System.out.println("Customer: " + customer));
    }

}
