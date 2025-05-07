
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Generic {

    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>();
        integerPrinter.setValue(20);
        integerPrinter.print();

        Printer<Double> doublePrinter = new Printer<>();
        doublePrinter.setValue(10.5);
        doublePrinter.print();

        // This 'var' is local variable type inference.
        // It allows user to declare local variables without explicitly specifying their type.
        // The compiler infers the type based on the value assigned to the variable.
        var stringPrinter = new Printer<String>();
        stringPrinter.setValue("Hello World!");
        stringPrinter.print();

        broadcast("Find me a developer.");
        broadcast(10);
        broadcast(50.25);
        broadcast(true);

        separate();

        broadcast("Kindly remember to read the memo.", "Mark Riley");
        broadcast(20, "Billy Bean");
        broadcast(75.98, "Kelly Burton");
        broadcast(false, "Fiona Quincy");

        separate();

        broadcast("I just landed in New York a few minutes ago.", "Bernice Hudson", "David Skeens");
        broadcast(50, "Doug Medina", "Masako Kessler");
        broadcast(125.44, "Maria Jones", "Brandi Trumbo");
        broadcast(true, "Ruth Ranney", "Isabel Salazar");

        separate();

        String message = receive("Pick me up at 9 am.");
        System.out.println("message: \"" + message + "\"");

        String sender = receive(75, "Benjamin Stone");
        System.out.println("sender: " + sender);

        separate();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(25);
        numbers.add(35);
        printAll(numbers);

        separate();

        List<Lion> pride = Arrays.asList(
                new Lion("Barbary Lion", 10),
                new Lion("Transvaal Lion", 4),
                new Lion("Congo Lion", 7)
        );
        printAll(pride);
    }

    // Put <T> before the return type to tell Java that this T is supposed to be a generic.
    private static <T> void broadcast(T message) {
        System.out.println("\"" + message + "\" is a broadcast message.");
    }

    // This form of generic has multiple parameters.
    private static <T, V> void broadcast(T message, V sender) {
        System.out.println("\"" + message + "\"" + " from (" + sender + ")" + " is a broadcast message with sender.");
    }

    private static <T, V, W> void broadcast(T message, V sender, W receiver) {
        System.out.println("\"" + message + "\"" + " from (" + sender + ")" + " to (" + receiver + ")" + " is a broadcast message with sender and receiver.");
    }

    private static <T> T receive(T message) {
        // You can also add some logic here.
        // System.out.println("message: " + message);
        return message;
    }

    private static <T, V> V receive(T message, V sender) {
        System.out.println("\"" + message + "\" is a broadcast message.");
        return sender;
    }

    // Question Mark is a wild card for an unknown list.
    // You use wild card a question mark as the type of parameter when you're using generic,
    // when you're unsure what exactly that generic type is going to be.
    private static void printAll(List<?> list) {
        list.stream().forEach(System.out::println);
    }

    private static void separate() {
        System.out.println();
    }

}

// Type 'T' in generic class is a placeholder for the type of variable.
// User can name it in different ways, but it is part of convention.
class Printer<T> {

    private T value;

    public Printer() {
        // No-args constructor.
    }

    public Printer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println(value);
    }

}

class Lion {

    private String name;
    private int age;

    public Lion() {
        // No-args constructor.
    }

    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "(" + name + ") -> " + age;
    }

}
