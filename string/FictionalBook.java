
public class FictionalBook {

    public static void main(String[] args) {
        // Strings are immutable means their values cannot be changed once they are created.
        String book1 = "Norwegian Wood";
        String book2 = "Norwegian Wood";

        // They are case-sensitive.
        System.out.println("book1 == book2? " + (book1 == book2));          // Output: true
        System.out.println("book1 equals book2? " + (book1.equals(book2))); // Output: true

        /*
         * When you create a string using double quotes (""),
         * the JVM checks if the literal already exists in the SCP.
         * 
         * If it does, the JVM reuses it; otherwise, it creates a new string in the SCP. */
        String book3 = "Kafka On The Shore";

        /*
         * When you create a string using the new keyword,
         * the JVM always creates a new object in the Heap,
         * even if an identical string exists in the SCP. */
        String book4 = new String("Kafka On The Shore");

        /*
         * The intern method forces a string object to be added to the SCP.
         * If the string already exists in the SCP,
         * it returns the existing reference; otherwise, it adds the string to the pool. */
        String book5 = book4.intern();

        // This string will not be added to the String Constant Pool.
        String book6 = new String("Kafka On The Shore");

        System.out.println("book3 == book4? " + (book3 == book4));          // Output: false
        System.out.println("book3 equals book4? " + (book3.equals(book4))); // Output: true

        System.out.println("book3 == book5? " + (book3 == book5));          // Output: true
        System.out.println("book3 equals book5? " + (book3.equals(book5))); // Output: true

        System.out.println("book4 == book6? " + (book4 == book6));          // Output: false
        System.out.println("book4 equals book6? " + (book4.equals(book6))); // Output: true
    }

}
