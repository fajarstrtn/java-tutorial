
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

public class Billboard {

    public static void main(String[] args) {

        Consumer<String> ad = message -> System.out.println(message);
        ad.accept("iPhone 16 here now!");

        Consumer<List<Integer>> pricetag = list -> {
            list.forEach(System.out::println);
        };

        List<Integer> price = new ArrayList<Integer>();
        price.add(10);
        price.add(50);
        price.add(150);
        price.add(350);
        price.add(500);
        pricetag.accept(price);

        Consumer<List<String>> customer = list -> list.stream().forEach(System.out::println);
        List<String> products = new ArrayList<String>();
        products.add("iPhone 16");
        products.add("Corkcicle");
        products.add("Steve Madden");
        customer.accept(products);

    }

}
