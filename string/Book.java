
public class Book {

    public static void main(String[] args) {
        boolean isEqual;

        /*
         * Strings are immutable means their values cannot be changed once they are created.
         * 
         * When you create a string using double quotes (""),
         * JVM checks if the literal already exists in the SCP.
         * If it does, the JVM reuses it.
         * Otherwise, it creates a new string in the SCP. */
        String book1 = "Norwegian Wood";

        // They are case-sensitive.
        String book2 = "Norwegian Wood";

        isEqual = book1 == book2;
        System.out.println("book1 == book2? " + isEqual);                   // Output: true
        System.out.println("book1 equals book2? " + (book1.equals(book2))); // Output: true

        String book3 = "Kafka On The Shore";

        /*
         * When you create a string using the new keyword,
         * the JVM always creates a new object in the Heap,
         * even if an identical string exists in the SCP. */
        String book4 = new String("Kafka On The Shore");

        /*
         * The intern method forces a string object to be added to the SCP.
         * 
         * If the string already exists in the SCP,
         * it returns the existing reference; otherwise,
         * it adds the string to the pool. */
        String book5 = book4.intern();

        // This string will not be added to the String Constant Pool.
        String book6 = new String("Kafka On The Shore");

        isEqual = book3 == book4;
        System.out.println("book3 == book4? " + isEqual);                   // Output: false
        System.out.println("book3 equals book4? " + (book3.equals(book4))); // Output: true

        isEqual = book3 == book5;
        System.out.println("book3 == book5? " + isEqual);                   // Output: true
        System.out.println("book3 equals book5? " + (book3.equals(book5))); // Output: true

        isEqual = book4 == book6;
        System.out.println("book4 == book6? " + isEqual);                   // Output: false
        System.out.println("book4 equals book6? " + (book4.equals(book6))); // Output: true
    }

}
