
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoining {

    public static void main(String[] args) {

        List<String> listOfString = Arrays.asList("Jakarta", "Bali", "Lombok", "Surabaya");

        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add(listOfString.get(0)).add(listOfString.get(1));
        System.out.println(stringJoiner);

        StringJoiner anotherStringJoiner = new StringJoiner("/");
        anotherStringJoiner.add(listOfString.get(2)).add(listOfString.get(3));
        System.out.println(anotherStringJoiner);

        stringJoiner.merge(anotherStringJoiner);
        System.out.println(stringJoiner.toString());
        System.out.println(stringJoiner.length());
        
    }
}
