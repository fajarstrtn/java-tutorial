
public class MemoryAllotment {

    public static void main(String[] args) {
        // Get the informational HashCode of each variable.
        String name = "John Doe";
        int nameAddress = System.identityHashCode(name);

        String aliasName = new String(name);
        int aliasNameAddress = System.identityHashCode(aliasName);

        System.out.println("Identical? " + (nameAddress == aliasNameAddress)); // Output: Identical? false

        String catName = "Kiwi";
        int catNameAddress = System.identityHashCode(catName);

        String aliasCatName = new String(catName).intern();
        int aliasCatNameAddress = System.identityHashCode(aliasCatName);

        System.out.println("Identical? " + (catNameAddress == aliasCatNameAddress)); // Output: Identical? true
    }

}
