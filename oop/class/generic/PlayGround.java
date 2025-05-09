
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PlayGround {

    public static void main(String[] args) {
        // ? extends Class (Upper Bounded Wildcard)
        // This means: "any type that is Class or a subclass (child) of Class".
        // 
        // This has the same form: List<Integer extends Number> number = new ArrayList<Integer>();
        // Use when you only need to read from a generic collection, not modify it.
        List<? extends Number> numbers = new ArrayList<Integer>();
        numbers = Arrays.asList(10, 20, 30, 40, 50);

        // You can't add elements (except null) to the list because the compiler doesn't know the specific subtype.
        // numbers.add(10); will cause an error.
        numbers.forEach(System.out::println);

        // ? super Class (Lower Bounded Wildcard)
        // This means: "any type that is Class or a superclass (parent) of Class".
        // 
        // This has the same form: List<Number super Integer> anotherNumbers = new ArrayList<Number>();
        // Use when you only need to write to a generic collection.
        List<? super Integer> anotherNumbers = new ArrayList<Number>();
        anotherNumbers.add(100);

        // You can't safely read specific types from the list (except as Object) because the compiler doesn't know the actual supertype.
        // Number number = anotherNumbers.get(0); will cause an error.
        Object number = anotherNumbers.get(0);
        System.out.println(number);

        List<? extends Number> credit = Arrays.asList(10.5, 3.0, 4.1, 2.7, 5.5);
        read(credit);

        List<? super Integer> debit = new ArrayList<Number>();
        write(debit);
        debit.stream().forEach(System.out::println);
    }

    private static void read(List<? extends Number> saldo) {
        saldo.forEach(System.out::println);
    }

    private static void write(List<? super Integer> saldo) {
        saldo.add(11);
        saldo.add(21);
        saldo.add(31);
        saldo.add(41);
        saldo.add(51);
    }

}
