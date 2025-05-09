
import java.util.function.Supplier;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Gachapon {

    public static void main(String[] args) {
        Random random = new Random();

        List<String> items = List.of("Evangelion", "Gundam", "One-Piece", "Naruto");

        // Supplier interface doesn't need any params, but returns a result.
        Supplier<String> item = () -> items.get(random.nextInt(items.size()));
        System.out.println(item.get());

        // You can also create an infinite stream with Supplier interface.
        Stream.generate(item).limit(5).forEach(System.out::println);
    }

}
