
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Joiner {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jakarta", "Bali", "Lombok", "Bandung");
        StringJoiner joiner1 = new StringJoiner(",");
        joiner1.add(
                list.get(0))
                .add(list.get(1));
        System.out.println(joiner1); // Output: Jakarta,Bali

        StringJoiner joiner2 = new StringJoiner("/");
        joiner2.add(
                list.get(2))
                .add(list.get(3));
        System.out.println(joiner2); // Output: Lombok/Bandung

        joiner1.merge(joiner2);
        System.out.println(joiner1.toString()); // Output: Jakarta,Bali,Lombok/Bandung
        System.out.println(joiner1.length());   // Output: 27
    }

}
