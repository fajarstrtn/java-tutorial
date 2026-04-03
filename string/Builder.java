
public class Builder {

    // append() method concatenates the given argument with this string.
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
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String text = sb.toString();
        System.out.println(text);
    }

    private static void create(int capacity) {
        StringBuilder sb = new StringBuilder(capacity);
        sb.append("Hello World");
        String text = sb.toString();
        System.out.println(text);
    }

    private static void create(String message) {
        StringBuilder sb = new StringBuilder(message);
        String text = sb.toString();
        System.out.println(text);
    }

    private static void create(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        String text = sb.toString();
        System.out.println(text);
    }

    // insert() method inserts the given string with this string at the given position.
    private static void insert(int index, String message) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(index, message);
        String text = sb.toString();
        System.out.println(text);
    }

    // The replace method replaces the given string from the specified beginIndex and endIndex-1.
    private static void replace(int index, int length, String message) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(index, length, message);
        String text = sb.toString();
        System.out.println(text);
    }

    // delete() method deletes the string from the specified beginIndex to endIndex-1.
    private static void delete(int index, int length) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.delete(index, length);
        String text = sb.toString();
        System.out.println(text);
    }

    // reverse() method reverses the current string.
    private static void reverse() {
        StringBuilder sb = new StringBuilder("Hello World!");
        sb.reverse();
        String text = sb.toString();
        System.out.println(text);
    }

    /*
     * capacity() method returns the current capacity of the builder.
     * default capacity of the builder is 16.
     * 
     * If number of characters increases from its current capacity,
     * it increases the capacity by (old capacity * 2) + 2. */
    private static void capacity() {
        StringBuilder sb = new StringBuilder();
        int capacity = sb.capacity();
        System.out.println("Old Capacity: " + capacity);

        sb.append("Hello World");
        sb.append("Java is my favorite language");
        capacity = sb.capacity();
        System.out.println("New Capacity: " + capacity);
    }

    // length() method returns the number of character in given string.
    private static void length() {
        StringBuilder sb = new StringBuilder("Hello World");
        int length = sb.length();
        System.out.println("Length: " + length);
    }

    /*
     * trimToSize() method is an in-built method used to trim
     * the capacity used for the character sequence of StringBuffer object. */
    private static void trimToSize() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append(" ");
        sb.append("This is John Doe");
        int capacity = sb.capacity();
        System.out.println("Old capacity: " + capacity);

        sb.trimToSize();
        capacity = sb.capacity();
        System.out.println("New capacity: " + capacity);
    }

    /*
     * indexOf() method returns the index of the String for first occurrence
     * of passed substring as parameter from the sequence contained by this object. */
    private static void indexOf(String chunk) {
        StringBuilder sb = new StringBuilder("Hello World");
        int index = sb.indexOf(chunk);
        System.out.println(index);
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
