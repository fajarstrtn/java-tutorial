
public class Printer {

    /*
     * Varargs lets a method to take many values or even no value at all.
     * The '...' expression is a variable argument. */
    private static void print(String... args) {
        System.out.println("Length of args: " + args.length);
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print("Lorem ipsum dolor sit amet".split(" "));
        print("Hello", "world");
        print("Hello", "world!", "My", "name", "is", "John", "Doe");
        print();
    }

}
