
public class Buffer {

    // append() method concatenates the given argument with this string.
    private static void create() {
        /*
         * The StringBuffer class represents a sequence of characters that can be modified,
         * which means you can change the content of the StringBuffer
         * without creating a new object every time.
         * It represents a mutable sequence of characters.
         * 
         * StringBuffer are mutable it means that you can change the content
         * after the object has been created, on the other hand
         * String are immutable once it created, it can not be modified.
         * 
         * StringBuffer is thread-safe. */
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        String text = sb.toString();
        System.out.println(text);
    }

    private static void create(int capacity) {
        StringBuffer sb = new StringBuffer(capacity);
        sb.append("Hello World");
        String text = sb.toString();
        System.out.println(text);
    }

    private static void create(String message) {
        StringBuffer sb = new StringBuffer(message);
        String text = sb.toString();
        System.out.println(text);
    }

    // insert() method inserts the given string with this string at the given position.
    private static void insert(int index, String message) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(index, message);
        String text = sb.toString();
        System.out.println(text);
    }

    // replace() method replaces the given string from the specified beginIndex and endIndex-1.
    private static void replace(int index, int length, String message) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(index, length, message);
        String text = sb.toString();
        System.out.println(text); // Output: Hey, bro! World!
    }

    // delete() method deletes the string from the specified beginIndex to endIndex-1.
    private static void delete(int index, int length) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(index, length);
        String text = sb.toString();
        System.out.println(text);
    }

    //reverse() method reverses the current string.
    private static void reverse() {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.reverse();
        String text = sb.toString();
        System.out.println(text);
    }

    /*
     * capacity() method returns the current capacity of the buffer.
     * default capacity of the buffer is 16.
     * 
     * If number of characters increases from its current capacity,
     * it increases the capacity by (old capacity * 2) + 2. */
    private static void capacity() {
        StringBuffer sb = new StringBuffer();
        int capacity = sb.capacity();
        System.out.println("Old Capacity: " + capacity);

        sb.append("Hello World");
        sb.append("Java is my favorite language");
        capacity = sb.capacity();
        System.out.println("New Capacity: " + capacity);
    }

    // length() method returns the number of character in given string.
    private static void length() {
        StringBuffer sb = new StringBuffer("Hello World");
        int length = sb.length();
        System.out.println("Length: " + length);
    }

    /*
     * trimToSize() method is an in-built method used to trim
     * the capacity used for the character sequence of StringBuffer object. */
    private static void trimToSize() {
        StringBuffer sb = new StringBuffer();
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
