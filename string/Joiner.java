
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Joiner {

    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Jakarta", "Bali", "Lombok", "Bandung");
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add(listOfString.get(0)).add(listOfString.get(1));

        System.out.println(stringJoiner); // Output: Jakarta,Bali

        StringJoiner anotherStringJoiner = new StringJoiner("/");
        anotherStringJoiner.add(listOfString.get(2)).add(listOfString.get(3));

        System.out.println(anotherStringJoiner); // Output: Lombok/Bandung

        stringJoiner.merge(anotherStringJoiner);

        System.out.println(stringJoiner.toString()); // Output: Jakarta,Bali,Lombok/Bandung
        System.out.println(stringJoiner.length());   // Output: 27
    }

}
