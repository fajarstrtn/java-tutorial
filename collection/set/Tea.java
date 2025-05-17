
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Iterator;

public class Tea {

    public static void main(String[] args) {
        // Since Set is an interface, it can be used only with a class that implements this interface.
        // HashSet is one of the widely used classes which implements the Set interface.
        // 
        // HashSet class which is implemented in the collection framework is an inherent implementation of the hash table data structure.
        // The objects that you insert into the HashSet do not guarantee to be inserted in the same order.
        // The objects are inserted based on their hashcode.
        // This class also allows the insertion of null elements.
        Set<String> set = new HashSet<>();

        // In order to add an element to the Set, you can use the add method.
        // However, the insertion order is not retained in the Set.
        // Internally, for every element, a hash is generated and the values are stored with respect to the generated hash.
        // The values are compared and sorted in ascending order.
        // You need to keep a note that duplicate elements are not allowed and all the duplicate elements are ignored.
        // And also, null values are accepted by the Set.
        set.add("Green Tea");
        set.add("Black Tea");
        set.add("Yellow Tea");
        set.add("Oolong Tea");
        set.add("Matcha");

        // HashSet stores unique element and does not maintain any insertion order.
        System.out.println("First occurence of the Set: " + set); // [Oolong tea, Yellow Tea, Black Tea, Green Tea, Matcha]

        // If you wish to access the elements, you can use inbuilt methods like contains().
        // The Set interface in Java does not have a get() method due to its fundamental nature and the contract it establishes for its implementations.
        // Sets are designed to store unique elements without any specific order.
        // Therefore, accessing an element by index, as one would do with a List, is not a meaningful operation for a Set.
        // The absence of a get() method aligns with the core principles of the Set interface:
        // 1. Uniqueness: Sets guarantee that no duplicate elements are stored.
        // 2. No defined order: Unlike lists, sets do not maintain the order in which elements are added.
        // 
        // If a get() method were to be introduced, it would raise questions about its behavior:
        // 1. get(index): Since sets are unordered, an index-based retrieval would not be logically consistent.
        // 2. get(object): If the object is already known, there is no need to "get" it from the set. The contains() method already serves the purpose of checking for the presence of an element.
        // 
        // While some Set implementations, such as LinkedHashSet and TreeSet,
        // maintain a specific order (insertion order and sorted order, respectively),
        // they still do not offer a get() method.
        // This is because the Set interface itself does not define this behavior,
        // and providing it in specific implementations could lead to confusion and inconsistencies.
        // 
        // If retrieval by index is required, it is recommended to convert the Set to a List,
        // which provides indexed access to its elements.
        boolean containsMatcha = set.contains("Matcha");

        System.out.println("Is Matcha in the set? " + containsMatcha + ".");

        // Removing an element in the set.
        set.remove("Oolong Tea");

        System.out.println("Second occurence of the Set: " + set);

        for (var tea : set) {
            System.out.println("Iterating over enhanced for-loop: " + tea);
        }

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            String tea = iterator.next();
            System.out.println("Iterating over iterator: " + tea);
        }

        Set<TeaBrands> teaBrands = EnumSet.of(
                TeaBrands.TWININGS,
                TeaBrands.LIPTON,
                TeaBrands.TETLEY,
                TeaBrands.CELESTIAL_SEASONINGS,
                TeaBrands.TAZO,
                TeaBrands.YOGI_TEA,
                TeaBrands.TEA_FORTE
        );

        System.out.println("First occurence of the EnumSet: " + teaBrands);

        boolean containsLipton = teaBrands.contains(TeaBrands.LIPTON);
        System.out.println("Is Lipton available? " + containsLipton + ".");
    }

}

enum TeaBrands {
    TWININGS, LIPTON, TETLEY, CELESTIAL_SEASONINGS, TAZO, YOGI_TEA, TEA_FORTE
}
