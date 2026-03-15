
public class Builder {

    private static void create() {
        /*
         * StringBuilder class is a part of the java.lang package
         * that provides a mutable sequence of characters.
         * 
         * Unlike String (which is immutable), StringBuilder allows in-place modifications,
         * making it memory-efficient and faster for frequent string operations.
         * 
         * StringBuilder is not thread-safe. */
        StringBuilder sb = new StringBuilder();

        // The append method concatenates the given argument with this string.
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void create(int capacity) {
        StringBuilder sb = new StringBuilder(capacity);
        sb.append("Hello World!");
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void create(String message) {
        StringBuilder sb = new StringBuilder(message);
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void create(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void insert(int index, String message) {
        StringBuilder sb = new StringBuilder("Hello World!");

        // The insert method inserts the given string with this string at the given position.
        sb.insert(index, message);
        String text = sb.toString();

        System.out.println(text); // Output: HAmsterdamello World!
    }

    private static void replace(int index, int length, String message) {
        StringBuilder sb = new StringBuilder("Hello World!");

        // The replace method replaces the given string from the specified beginIndex and endIndex-1.
        sb.replace(index, length, message);
        String text = sb.toString();

        System.out.println(text); // Output: Amsterdam World!
    }

    private static void delete(int index, int length) {
        StringBuilder sb = new StringBuilder("Hello World!");

        // The delete method is used to delete the string from the specified beginIndex to endIndex-1.
        sb.delete(index, length);
        String text = sb.toString();

        System.out.println(text); // Output: Hello
    }

    private static void reverse() {
        StringBuilder sb = new StringBuilder("Hello World!");

        // The reverse method of the StringBuffer class reverses the current string.
        sb.reverse();
        String text = sb.toString();

        System.out.println(text); // Output: !dlroW olleH
    }

    private static void capacity() {
        /*
         * The capacity method of the StringBuilder class returns
         * the current capacity of the builder.
         * The default capacity of the builder is 16.
         * If the number of characters increases from
         * its current capacity, it increases the capacity by (old capacity * 2) + 2. */
        StringBuilder sb = new StringBuilder();
        int capacity = sb.capacity();

        System.out.println("Old Capacity: " + capacity); // Output: Old Capacity: 16

        sb.append("Hello World");
        sb.append("Java is my favourite language");
        capacity = sb.capacity();

        System.out.println("New Capacity: " + capacity); // Output: New Capacity: 40
    }

    private static void length() {
        StringBuilder sb = new StringBuilder("Hello World!");

        // The length method returns the number of character in given string.
        int length = sb.length();

        System.out.println("Length: " + length); // Output: Length: 12
    }

    private static void trimToSize() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        sb.append(" ");
        sb.append("This is John Doe");
        int capacity = sb.capacity();

        System.out.println("Old capacity: " + capacity); // Output: Old capacity: 34

        /*
         * The trimToSize method is the inbuilt method
         * used to trims the capacity used for the character sequence
         * of StringBuffer object. */
        sb.trimToSize();
        capacity = sb.capacity();

        System.out.println("New capacity: " + capacity); // Output: New capacity: 29
    }

    private static void indexOf(String chunk) {
        StringBuilder sb = new StringBuilder("Hello World");

        /*
         * The indexOf method is used to return the index of
         * the String for first occurrence of passed substring
         * as parameter from the sequence contained by this object. */
        int index = sb.indexOf(chunk);

        System.out.println(index); // Output: 2
    }

    public static void main(String[] args) {
        create();
        create(50);
        create("Hello World!");
        create("Hello World!");
        insert(1, "Amsterdam");
        replace(0, 5, "Amsterdam");
        delete(5, 12);
        reverse();
        capacity();
        length();
        trimToSize();
        indexOf("llo");
    }

}
