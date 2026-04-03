
public class MemoryAllotment {

    public static void main(String[] args) {
        // System.identityHashCode() gets the informational HashCode of each variable.
        int name1 = System.identityHashCode("John Doe");
        int alias1 = System.identityHashCode(new String("John Doe"));
        System.out.println(name1 == alias1); // Output: false

        int name2 = System.identityHashCode("Kiwi");
        int alias2 = System.identityHashCode(new String("Kiwi").intern());
        System.out.println(name2 == alias2); // Output: true
    }

}
