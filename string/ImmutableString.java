
public class ImmutableString {

    public static void main(String[] args) {

        String name = "john";

        /* String objects are immutable, means that unmodifiable or unchangeable.
        Once a string object is created its data or state cannot be changed but a new string object is created. */
        name.concat(" doe");

        System.out.println(name);

    }

}
