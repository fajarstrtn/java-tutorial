
import java.util.Set;
import java.util.LinkedHashSet;

public class ShowRoom {

    public static void main(String[] args) {
        // LinkedHashSet class which is implemented in the collections framework is an ordered version of HashSet
        // that maintains a doubly-linked List across all elements.
        // When the iteration order is needed to be maintained this class is used.
        // When iterating through a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate
        // through the elements in the order in which they were inserted.
        // 
        // LinkedHashSet in Java implements the Set interface of the Collection Framework.
        // It combines the functionality of a HashSet with a LinkedList to maintain the insertion order of elements.
        // Several functionality including:
        // 1. Stores unique elements only.
        // 2. Maintains insertion order.
        // 3. Provides faster iteration compared to HashSet.
        // 4. Allows null elements.
        Set<String> cars = new LinkedHashSet<>();

        // The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
        // When the iteration order is needed to be maintained this class is used.
        cars.add("Audi");
        cars.add("VW");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("McLaren");
        cars.add("Hyundai");
        cars.add("BYD");
        cars.add("Lotus");
        cars.add("Citroen");
        cars.add(null);

        System.out.println(cars); // [Audi, VW, Mercedes, BMW, Honda, Toyota, McLaren, Hyundai, BYD, Lotus, Citroen, null]
    }

}
