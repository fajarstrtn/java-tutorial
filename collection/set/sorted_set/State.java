
import java.util.Iterator;
import java.util.SortedSet;
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
    }

}
