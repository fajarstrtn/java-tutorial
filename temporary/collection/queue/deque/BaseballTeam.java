
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class BaseballTeam {

    private static boolean greaterThan15(String team) {
        return team.length() > 15;
    }

    public static void main(String[] args) {
        // You cannot instantiate a Queue directly as it is an interface.
        // Here, you can use a class like LinkedList or PriorityQueue that implements this interface.
        // Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.
        // Note that neither of these implementations is thread-safe.
        // PriorityBlockingQueue is one alternative implementation if the thread-safe implementation is needed.
        // In Java, the Queue interface is a subtype of the Collection interface and represents a collection of elements in a specific order.
        // It follows the first-in, first-out (FIFO) principle.
        // This means that the elements are retrieved in the order in which they were added to the queue.
        Queue<String> teams = new LinkedList<>();

        // This add method of Queue Interface inserts the element passed in the parameter to the end of the queue if there is space.
        // If the Queue is capacity restricted and no space is left for insertion, it returns an IllegalStateException.
        // It returns true on successful insertion.
        // Adding teams to the Queue.
        teams.add("LA Dodgers");
        teams.add("Oakland Athletics");
        teams.add("Arizona Diamondbacks");
        teams.add("Atlanta Braves");
        teams.add("Baltimore Orioles");

        System.out.println("First occurence of the queue: " + teams);

        // It returns and removes the element at the front of the container.
        // It deletes the head/front of the container.
        // The method throws an NoSuchElementException when the Queue is empty.
        String removedTeam = teams.remove();
        System.out.println("Removed team is " + removedTeam + ".");

        System.out.println("Second occurence of the queue: " + teams);

        // Adding an element to the rear of the queue.
        // If the queue is full, it throws an exception.
        boolean isRedSoxAdded = teams.add("Boston Red Sox");
        System.out.println("Is Boston RedSox joining the MLB? " + isRedSoxAdded + ".");

        System.out.println("Third occurence of the queue: " + teams);

        // It returns the element at the front of the queue without removing it.
        String peek = teams.peek();
        System.out.println("Value of peek is " + peek + ".");

        // The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue.
        // All Queues except the Deque supports insertion and removal at the tail and head of the queue respectively.
        // The Deque support element insertion and removal at both ends. 
        System.out.println("Fourth occurence of the queue: " + teams);

        // Adding all the elements in the given collection to the queue.
        // When a single parameter is passed, it adds all the elements of the given collection at the end of the queue.
        teams.addAll(new ArrayList<>(Arrays.asList(
                "Chicaco Cubs",
                "Chicago White Sox",
                "Cincinnati Reds",
                "Cleveland Indians",
                "Colorado Rockies",
                "Detroit Tigers"
        )));

        System.out.println("Fifth occurence of the queue: " + teams);

        boolean containsBaltimoreOrioles = teams.contains("Baltimore Orioles");
        System.out.println("Is Baltimore Orioles in the MLB? " + containsBaltimoreOrioles + ".");

        boolean isEmpty = teams.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty + ".");

        teams.removeIf(BaseballTeam::greaterThan15);

        System.out.println("Sixth occurence of the queue: " + teams);

        boolean retainAll = teams.retainAll(new ArrayList<>(Arrays.asList(
                "Atlanta Braves",
                "Detroit Tigers",
                "Boston Red Sox"
        )));

        System.out.println("Is several team being retained? " + retainAll + ".");

        System.out.println("Seventh occurence of the queue: " + teams);

        teams.addAll(new ArrayList<>(Arrays.asList(
                "Minnesota Twins",
                "New York Mets",
                "Milwaukee Brewers",
                "Pittsburgh Pirates",
                "Philadelphia Phillies",
                "New York Yankees"
        )));

        System.out.println("Eighth occurence of the queue: " + teams);

        int size = teams.size();
        System.out.println("Size of MLB Teams is " + size + ".");

        for (String team : teams) {
            System.out.println("Iterating over enhanced for-loop: " + team);
        }

        Iterator<String> iterator = teams.iterator();

        while (iterator.hasNext()) {
            String team = iterator.next();
            System.out.println("Iterating over iterator: " + team);
        }

        teams.clear();

        try {
            // It returns null if the queue is empty.
            String team = teams.peek();
            System.out.println("Value of peeked element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            // It removes and returns the element at the front of the queue.
            // If the queue is empty, it returns null.
            String team = teams.poll();
            System.out.println("Value of polled element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            // It returns the element at the front of the queue without removing it.
            // If the queue is empty, it throws an exception.
            String team = teams.element();
            System.out.println("Value of selected element is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            // It removes and returns the element at the front of the queue.
            // If the queue is empty, it throws an exception.
            String team = teams.remove();
            System.out.println("Value of removed element is " + team);
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }
    }

}
