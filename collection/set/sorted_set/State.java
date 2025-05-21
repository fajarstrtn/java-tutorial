
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class State {

    public static void main(String[] args) {
        // The SortedSet interface is present in java.util package extends the Set interface present in the collection framework.
        // It is an interface that implements the mathematical set.
        // This interface contains the methods inherited from the Set interface and adds a feature that stores all the elements in this interface in a sorted manner.
        SortedSet<String> states = new TreeSet<>();

        // Elements are stored in ascending order by default.
        // Allows a custom order using a Comparator.
        states.add("California");
        states.add("Texas");
        states.add("Florida");
        states.add("Kentucky");
        states.add("Hawaii");

        // This ensures that no duplicate elements are present, consistent with the Set interface.
        states.add("Hawaii");

        // Inserting all the elements of the specified collection to the set.
        states.addAll(new ArrayList<>(
                Arrays.asList(
                        "Alaska",
                        "Ohio",
                        "Virginia",
                        "Massachusetts",
                        "Utah",
                        "Pennsylvania",
                        "North Carolina",
                        "Utah",
                        "Colorado",
                        "New York",
                        "Indiana",
                        "Illinois",
                        "Washington",
                        "Maryland",
                        "Missouri")
        )
        );

        System.out.println("First occurence of the SortedSet: " + states);

        try {
            // Null elements are not allowed, especially if natural ordering or a custom comparator is used.
            states.add(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        states.remove("Hawaii");

        System.out.println("Second occurence of the SortedSet: " + states);

        for (var state : states) {
            System.out.println("Iterating over enhanced for-loop: " + state);
        }

        Iterator<String> iterator = states.iterator();

        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println("Iterating over iterator: " + state);
        }

        boolean containsHawaii = states.contains("Hawaii");
        System.out.println("Is Hawaii part of the states? " + containsHawaii + ".");

        String firstState = states.first();
        System.out.println("First state is " + firstState + ".");

        String lastState = states.last();
        System.out.println("Last state is " + lastState + ".");

        boolean isFloridaRemoved = states.remove("Florida");
        System.out.println("Is Florida successfully removed? " + isFloridaRemoved + ".");

        // Removing all the elements from the set.
        states.removeAll(new ArrayList<>(Arrays.asList("Kentucky", "California")));

        System.out.println("Third occurence of the SortedSet: " + states);

        SortedSet<String> reversedStates = states.reversed();

        System.out.println("SortedSet is being reversed to " + reversedStates);

        NavigableSet<String> navigableStates = new TreeSet<>(states);

        System.out.println("NavigableSet is " + navigableStates);

        // It returns the lowest element among those elements that are greater than the specified element.
        // If the element passed exists in a tree set, it returns the element passed as an argument.
        String ceiling = navigableStates.ceiling("Arizona");
        System.out.println("Ceiling of Arizona is " + ceiling + ".");

        // It returns the greatest element among those elements that are less than the specified element.
        // If the element passed exists in a tree set, it returns the element passed as an argument.
        String floor = navigableStates.floor("Georgia");
        System.out.println("Floor of Georgia is " + floor + ".");

        // It returns the lowest element among those elements that are greater than the specified element.
        String higher = navigableStates.higher("Lousiana");
        System.out.println("Higher of Lousiana is " + higher + ".");

        // It returns the greatest element among those elements that are less than the specified element.
        String lower = navigableStates.lower("Connecticut");
        System.out.println("Lower of Connecticut is " + lower + ".");

        String pollFirst = navigableStates.pollFirst();
        System.out.println("Polling first of the NavigableSet: " + pollFirst + ".");

        String pollLast = navigableStates.pollLast();
        System.out.println("Polling last of the NavigableSet: " + pollLast);

        System.out.println("NavigableSet after polling first and last elements is " + navigableStates);
    }

}
