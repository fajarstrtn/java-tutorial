
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Validation {

    public static void main(String[] args) {

        Predicate<Integer> lessThan20 = x -> x < 20;
        System.out.println(lessThan20.test(50)); // false

        Predicate<Integer> greaterThan4 = x -> x > 4;
        System.out.println(greaterThan4.and(lessThan20).test(40)); // false
        System.out.println(greaterThan4.and(lessThan20).negate().test(40)); // true

        Predicate<String> contains = str -> str.toLowerCase().contains("am");
        Predicate<String> length = str -> str.length() <= 10;
        System.out.println(contains.or(length).test("United States of America")); // true

        Predicate<String> equals = Predicate.isEqual("Admin");
        System.out.println(equals.test("User")); // false
        System.out.println(equals.test("Admin")); // true

        List<String> roles = List.of("Admin", "User", "Sys-Admin", "Guest", "User", "Admin", "Sys-Admin", "Guest");
        Predicate<String> user = Predicate.isEqual("User");
        roles.stream().filter(user).forEach(System.out::println); // User\nUser

        int number = -100;
        boolean validatedNumber = isLessThan0(number, x -> x < 0);
        System.out.println("Is " + number + " less than 0? " + validatedNumber);

        String str = "Hello World";
        boolean validatedString = startsWith(str, x -> x.startsWith("Hello"));
        System.out.println("Does \"" + str + "\" start with \"Hello\"? " + validatedString);

        IntPredicate lessThanOrEquals20 = x -> x <= 20;
        System.out.println(lessThanOrEquals20.test(20)); // true

        int[] intArray1 = {5, 0, -10, 7, -2, 8, 0, 4, -3, -7, 8};
        IntPredicate positiveNumber = x -> x > 0;
        IntStream.of(intArray1).sorted().filter(positiveNumber).forEach(System.out::println); // A list of array printed in new lines

    }

    public static boolean isLessThan0(int number, IntPredicate lessThan0) {

        return lessThan0.test(number);

    }

    public static boolean startsWith(String str, Predicate<String> startsWith) {

        return startsWith.test(str);

    }

}
