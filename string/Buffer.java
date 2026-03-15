
public class Buffer {

    private static void create() {
        /*
         * The StringBuffer class in Java represents a sequence of characters
         * that can be modified, which means you can change
         * the content of the StringBuffer without creating a new object every time.
         * It represents a mutable sequence of characters.
         * 
         * The append method concatenates the given argument with this string.
         * 
         * StringBuffer is thread-safe. */
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void create(int capacity) {
        /*
         * StringBuffer are mutable it means that you can change the content
         * after the object has been created, on the other hand
         * String are immutable once it created it can not be modified. */
        StringBuffer sb = new StringBuffer(capacity);
        sb.append("Hello World!");
        String text = sb.toString();

        System.out.println(text); // Output: Hello World!
    }

    private static void create(String message) {
        StringBuffer sb = new StringBuffer(message);
        String text = sb.toString();

        System.out.println(text); // Hello World!
    }

    private static void insert(int index, String message) {
        StringBuffer sb = new StringBuffer("Hello World!");

        // The insert method inserts the given string with this string at the given position.
        sb.insert(index, message);
        String text = sb.toString();

        System.out.println(text); // Output: HAmsterdamello World!
    }

    private static void replace(int index, int length, String message) {
        StringBuffer sb = new StringBuffer("Hello World!");

        // The replace method replaces the given string from the specified beginIndex and endIndex-1.
        sb.replace(index, length, message);
        String text = sb.toString();

        System.out.println(text); // Output: Hey, bro! World!
    }

    private static void delete(int index, int length) {
        StringBuffer sb = new StringBuffer("Hello World!");

        // The delete method is used to delete the string from the specified beginIndex to endIndex-1.
        sb.delete(index, length);
        String text = sb.toString();

        System.out.println(text); // Output: Ho World!
    }

    private static void reverse() {
        StringBuffer sb = new StringBuffer("Hello World!");

        // The reverse method of the StringBuffer class reverses the current string.
        sb.reverse();
        String text = sb.toString();

        System.out.println(text); // Output: !dlroW olleH
    }

    private static void capacity() {
        /*
         * The capacity method of the StringBuffer class returns
         * the current capacity of the buffer.
         * The default capacity of the buffer is 16.
         * If the number of characters increases from
         * its current capacity, it increases the capacity by (old capacity * 2) + 2. */
        StringBuffer sb = new StringBuffer();
        int capacity = sb.capacity();

        System.out.println("Old Capacity: " + capacity);

        sb.append("Hello World");
        sb.append("Java is my favourite language");
        capacity = sb.capacity();

        System.out.println("New Capacity: " + capacity);
    }

    private static void length() {
        StringBuffer sb = new StringBuffer("Hello World!");
        int length = sb.length();

        System.out.println("Length: " + length);
    }

    private static void trimToSize() {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        sb.append(" ");
        sb.append("This is John Doe");
        int capacity = sb.capacity();

        System.out.println("Old capacity: " + capacity);

        /*
         * The trimToSize method is the inbuilt method used to
         * trims the capacity used for the character
         * sequence of StringBuffer object. */
        sb.trimToSize();
        capacity = sb.capacity();

        System.out.println("New capacity: " + capacity);
    }

    private static void indexOf(String chunk) {
        /*
         * The indexOf method is used to return the index of
         * the String for first occurrence of passed substring
         * as parameter from the sequence contained by this object. */
        StringBuffer sb = new StringBuffer("Hello World");
        int index = sb.indexOf(chunk);

        System.out.println(index);
    }

    public static void main(String[] args) {
        create();
        create(50);
        create("Hello World!");
        insert(1, "Amsterdam");
        replace(2, 5, "y, bro!");
        delete(1, 4);
        reverse();
        capacity();
        length();
        trimToSize();
        indexOf("llo");
    }

}
