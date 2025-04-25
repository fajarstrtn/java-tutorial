
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.Optional;

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
        Predicate<String> isUserEquals = Predicate.isEqual("User");
        roles.stream().filter(isUserEquals).forEach(System.out::println); // User\nUser

        int number = -100;
        boolean validatedNumber = isLessThan0(number, x -> x < 0);
        System.out.println("Is " + number + " less than 0? " + validatedNumber);

        String str = "Hello World";
        boolean validatedString = startsWith(str, x -> x.startsWith("Hello"));
        System.out.println("Does \"" + str + "\" start with \"Hello\"? " + validatedString);

        IntPredicate lessThanOrEquals20 = x -> x <= 20;
        System.out.println(lessThanOrEquals20.test(20)); // true

        int[] intArray1 = {5, 0, -10, 7, -2, 8, 0, 4, -3, -7, 8};
        IntPredicate isPositiveNumber = x -> x > 0;
        IntStream.of(intArray1).sorted().filter(isPositiveNumber).forEach(System.out::println); // A list of array printed in new lines

        List<User> users = List.of(
                new User("Elara", null, "Quinn", (byte) 20D, "Admin"),
                new User("Jaxon", null, "Rivera", (byte) 19D, "User"),
                new User("Ezra", "Moon", "Walker", (byte) 25D, "User"),
                new User("Luna", null, "Maris", (byte) 22D, "Admin"),
                new User("Eleanor", "Rowan", "Pierce", (byte) 29D, "Sys-Admin")
        );

        List<User> filteredUsers = filterRole(users, user -> user.getRole().equals("User"));
        filteredUsers.stream().map(user -> {
            StringBuilder sb = new StringBuilder();
            StringBuilder fullName = sb.append(user.getFirstName());

            if (Optional.ofNullable(user.getMiddleName()).isEmpty()) {
                fullName.append(" ").append(user.getLastName());
            } else {
                fullName.append(" ").append(user.getMiddleName()).append(" ").append(user.getLastName());
            }

            return fullName.toString() + ": " + user.getRole();
        }).forEach(System.out::println);

    }

    private static boolean isLessThan0(int number, IntPredicate lessThan0) {

        return lessThan0.test(number);

    }

    private static boolean startsWith(String str, Predicate<String> startsWith) {

        return startsWith.test(str);

    }

    private static List<User> filterRole(List<User> users, Predicate<User> filterRole) {
        return users.stream().filter(filterRole).toList();
    }

}

class User {

    private String firstName;
    private String middleName;
    private String lastName;
    private byte age;
    private String role;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, byte age, String role) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
