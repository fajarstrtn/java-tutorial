
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

        System.out.println("First occurence of the LinkedHashSet: " + cars); // [Audi, VW, Mercedes, BMW, Honda, Toyota, McLaren, Hyundai, BYD, Lotus, Citroen, null]

        List<String> anotherCars = new ArrayList<>(Arrays.asList("Chevrolet", "Ford", "Bentley", "Cadillac"));

        cars.addAll(anotherCars);

        System.out.println("Second occurence of the LinkedHashSet: " + cars);

        boolean isEqual = cars.equals(new ArrayList<>(Arrays.asList("Lotus")));
        System.out.println("Are both LinkedHashSet equal? " + isEqual + ".");

        boolean containsAll = cars.containsAll(new ArrayList<>(Arrays.asList("Toyota", "Honda", "Ford", "BMW")));
        System.out.println("Are Toyota, Honda, Ford, and BMW in the LinkedHashSet? " + containsAll + ".");

        // Retaining only the elements that are present in a specified collection.
        // It removes all other elements that do not match.
        // It removes elements that are not present in the second collection.
        // This method is useful when performing set intersection operations in Java collections.
        cars.retainAll(new ArrayList<>(Arrays.asList("Audi", "VW", "Toyota", "Honda", "Ford", "BYD", "Hyundai", "Lotus")));
        System.out.println("Value of cars after retaining elements is " + cars);

        try {
            // In the below example, the retainAll(null) is not a valid operation, so a NullPointerException is thrown.
            // The exception is caught in the catch block, preventing the program from crashing.
            cars.retainAll(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        boolean isAudiRemoved = cars.removeIf(ShowRoom::hasAudi);
        System.out.println("Is Audi successfully removed? " + isAudiRemoved + ".");
        System.out.println("Value of cars after Audi deletion is " + cars);

        cars.forEach(System.out::println);

        int size = cars.size();
        System.out.println("Size of cars is " + size);

        boolean isToyotaRemoved = cars.remove("Toyota");
        System.out.println("Is Toyota successfully removed? " + isToyotaRemoved + ".");
        System.out.println("Value of cars after Toyota deletion is " + cars);

        boolean isCarsRemoved = cars.removeAll(new LinkedHashSet<>(Arrays.asList("Ford", "Honda")));
        System.out.println("Are Ford and Honda removed? " + isCarsRemoved + ".");
        System.out.println("Value of cars after Ford and Honda deletion is " + cars);

        // Advantages of LinkedHashSet:
        // 1. It maintains insertion order.
        // 2. It allows quick insertion, deletion, and lookup of elements.
        // 3. It is useful for caching applications where insertion order is important.
        // 
        // Disadvantages of LinkedHashSet:
        // 1. It takes higher memory as compared to HashSet due to the linked list for maintaining insertion order.
        // 2. This is slightly slower operations compared to HashSet because of the linked structure.
        System.out.println("Third occurence of the LinkedHashSet: " + cars);
    }

    private static boolean hasAudi(String car) {
        return car.equalsIgnoreCase("audi");
    }

}
