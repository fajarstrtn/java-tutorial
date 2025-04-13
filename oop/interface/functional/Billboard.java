
import java.util.function.Consumer;

public class Billboard {

    public static void main(String[] args) {

        Consumer<String> ad = (String message) -> System.out.println(message);
        ad.accept("iPhone 16 here now!");

    }

}
