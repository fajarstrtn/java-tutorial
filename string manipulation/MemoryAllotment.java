
public class MemoryAllotment {

    public static void main(String[] args) {

        String name = "Fajar Satriatna";
        String aliasName = new String(name);

/*      Get the informational hashcode of each variable. */
        int nameAddress = System.identityHashCode(name);
        int aliasNameAddress = System.identityHashCode(aliasName);
        System.out.println("Identical? " + (nameAddress == aliasNameAddress));

        String catName = "Robert";
        String aliasCatName = new String(catName).intern();

        int catNameAddress = System.identityHashCode(catName);
        int aliasCatNameAddress = System.identityHashCode(aliasCatName);
        System.out.println("Identical? " + (catNameAddress == aliasCatNameAddress));

    }
}
