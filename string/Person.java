
public class Person {

    public static void main(String[] args) {
        /*
         * Whenever a String object is created as a literal,
         * the object will be created in the String Constant Pool.
         * This allows JVM to optimize the initialization of String literal.
         * The String Constant Pool is present in the heap.
         * 
         * String is immutable, once a String object is created, it cannot be changed.
         * If you try to change a String,
         * Java does not modify the original one,
         * it creates a new String object instead.
         * 
         * String class and all wrapper classes in Java that include
         * Boolean, Character, Byte, Short, Integer, Long, Float, and Double are immutable. */
        String fullName = "John Doe";
        String firstName = fullName.split(" ")[0];
        String bio = fullName.concat(" loves books and hate lizards");

        System.out.println(fullName);  // Output: John Doe
        System.out.println(firstName); // Output: John
        System.out.println(bio);       // Output: John Doe loves books and hate lizards

        // If you explicitly assign it to the reference variable, it will refer to the new object.
        fullName = "Jane Doe";
        System.out.println(fullName); // Output: Jane Doe

        char[] spelling = new char[]{'J', 'o', 'h', 'n'};
        String nickName = new String(spelling);
        System.out.println(nickName); // Output: John
    }

}
