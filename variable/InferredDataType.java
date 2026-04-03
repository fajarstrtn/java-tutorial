
public class InferredDataType {

    public static void main(String[] args) {
        var name = "John Doe";
        var age = 21;
        var address = "Boulevard Street 101th";

        /*
         * Inferred Data Type refers to a type of variable
         * that the compiler automatically deduces at compile time,
         * rather than requiring explicit declaration by the programmer.
         * 
         * This feature, known as type inference, aims to reduce verbosity
         * and improve code readability while maintaining Java's strong static typing.
         * 
         * Value of variable should be initialized right away
         * because the data type is determined at compile-time. */
        System.out.println("Hi! My name is " + name);     // Output: Hi! My name is John Doe
        System.out.println("I\'m " + age + " years-old"); // Output: I'm 21 years-old
        System.out.println("I lived in " + address);      // Output: I lived in Boulevard Street 101th
    }

}
