
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class MLSTeam {

    public static void main(String[] args) {
        // ArrayDeque is a resizable array implementation of the Deque interface, which stands for double-ended queue.
        // It allows elements to be added or removed from both ends efficiently.
        // It can be used as a stack (LIFO) or a queue (FIFO).
        // 
        // ArrayDeque grows dynamically. It generally provides faster operations than LinkedList because it does not have the overhead of node management.
        // Operations like addFirst(), addLast(), removeFirst(), removeLast() are all done in constant time O(1).
        // The ArrayDeque class implements these two interfaces Queue interface and Deque interface, support concurrent access by multiple threads.
        // 
        // This constructor is used to create an empty ArrayDeque and by default holds an initial capacity to hold 16 elements.
        Deque<String> teams = new ArrayDeque<>();

        // Adding a specific element at the end of the Deque.
        teams.add("Vancouver Whitecaps FC");
        teams.add("San Jose Earthquakes");
        teams.add("Real Salt Lake");
        teams.add("D.C. United");
        teams.add("LA Galaxy");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.add(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("First occurence of ArrayDeque: " + teams); // [Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy]

        // Adding a specific element at the front of the Deque.
        teams.addFirst("FC Cincinnati");
        teams.addFirst("Orlando City");
        teams.addFirst("CF Montréal");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.addFirst(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("Second occurence of ArrayDeque: " + teams); // [CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy]

        // Adding a specific element at the end of the Deque. It is similar to the add method.
        // The Time Complexity of this addLast(Object element) is O(1) i.e Constant.
        teams.addLast("Atlanta United");
        teams.addLast("Austin FC");
        teams.addLast("Charlotte FC");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.addLast(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("Third occurence of ArrayDeque: " + teams); // [CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Austin FC, Charlotte FC]

        // Adding a specific element at the end of the Deque.
        // The function is similar to the offerLast method of ArrayDeque in Java.
        // It returns true if the element is successfully added into the deque else it returns false.
        teams.offer("Chicago Fire FC");
        teams.offer("Colorado Rapids");
        teams.offer("Columbus Crew");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.offer(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("Fourth occurence of ArrayDeque: " + teams); // [CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Austin FC, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew]

        teams.offerFirst("FC Dallas");
        teams.offerFirst("Houston Dynamo FC");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.offerFirst(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("Fifth occurence of ArrayDeque: " + teams); // [Houston Dynamo FC, FC Dallas, CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Austin FC, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew]

        teams.offerLast("Sporting Kansas City");
        teams.offerLast("Los Angeles Football Club");

        try {
            // It throws NullPointerException if the passed parameter is null.
            teams.offerLast(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        System.out.println("Sixth occurence of ArrayDeque: " + teams); // [Houston Dynamo FC, FC Dallas, CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Austin FC, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City, Los Angeles Football Club]

        // Retrieving or fetching the first element of the Deque.
        // The method returns the first element present in the Deque.
        // In the process, the method does not delete the element from the Deque instead
        // it just returns the first element of the Deque.
        String firstTeam = teams.getFirst();
        System.out.println("First team is " + firstTeam + ".");

        // Retrieving or fetching the last element of the Deque.
        // In the process, the method does not delete the element from the Deque instead
        // it just returns the last element of the Deque.
        String lastTeam = teams.getLast();
        System.out.println("Last team is " + lastTeam + ".");

        // It returns the element at the head of the Deque.
        // The element retrieved does not get deleted or removed from the Queue instead the method just returns it.
        // If no element is present in the deque then null is returned.
        String peek = teams.peek();
        System.out.println("Peeked team is " + peek + ".");

        // Retrieving or fetching the first element of the Deque.
        // The element retrieved does not get deleted or removed from the Queue instead the method just returns it.
        // If no element is present in the Deque or it is empty, then null is returned.
        String peekFirst = teams.peekFirst();
        System.out.println("Value of the peekFirst method is " + peekFirst + ".");

        String peekLast = teams.peekLast();
        System.out.println("Value of the peekLast method is " + peekLast + ".");

        // Removing the element present at the head of the Deque.
        teams.remove();

        System.out.println("Seventh occurence of ArrayDeque: " + teams); // [FC Dallas, CF Montréal, Orlando City, FC Cincinnati, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Austin FC, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City, Los Angeles Football Club]

        // Removing a particular element from a Deque.
        // It returns true if the specified element is present in the Deque else it returns false.
        teams.remove("FC Cincinnati");
        teams.remove("Austin FC");

        System.out.println("Eighth occurence of ArrayDeque: " + teams); // [FC Dallas, CF Montréal, Orlando City, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City, Los Angeles Football Club]

        // Removing the first element of the Deque.
        // It returns the first element of the Deque after removing it.
        // The method throws NoSuchElementException is thrown if the Deque is empty.
        String removedFirstTeam = teams.removeFirst();

        // Removing the last element of the Deque.
        // This method returns the last element of the Deque after removing it.
        // The method throws NoSuchElementException if the Deque is empty.
        String removedLastTeam = teams.removeLast();
        System.out.println("What team has been removed from MLS? " + (new ArrayList<>(Arrays.asList(removedFirstTeam, removedLastTeam))));

        System.out.println("Ninth occurence of ArrayDeque: " + teams); // [CF Montréal, Orlando City, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City]

        // Retrieving or fetching and removing the element present at the head of the Deque.
        // The peek method only retrieved the element at the head but the poll also removes the element
        // along with the retrieval. It returns null if the Deque is empty.
        String polledTeam = teams.poll();
        System.out.println("Value of polled team is " + polledTeam + ".");

        System.out.println("Tenth occurence of ArrayDeque: " + teams); // [Orlando City, Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City]

        // Retrieving or fetching and removing the element present at the head of the Deque.
        String firstPolledTeam = teams.pollFirst();
        System.out.println("Value of first polled team is " + firstPolledTeam + ".");

        System.out.println("Eleventh occurence of ArrayDeque: " + teams); // [Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew, Sporting Kansas City]

        // Retrieving or fetching and removing the element present at the tail of the Deque.
        String lastPolledTeam = teams.pollLast();
        System.out.println("Value of last polled team is " + lastPolledTeam + ".");

        System.out.println("Twelfth occurence of ArrayDeque: " + teams); // [Vancouver Whitecaps FC, San Jose Earthquakes, Real Salt Lake, D.C. United, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew]

        // Popping an element from the Deque.
        // The element is popped from the top of the Deque and is removed from the same.
        // It returns the element present at the front of the Deque.
        // It throws NoSuchElementException is thrown if the Deque is empty.
        teams.pop();
        teams.pop();
        teams.pop();

        // Retrieving or fetching and removing the element present at the head of the Deque (FIFO).
        String poppedTeam = teams.pop();
        System.out.println("Value of popped team is " + poppedTeam + ".");

        System.out.println("Thirteenth occurence of ArrayDeque: " + teams); // [LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew]

        // Pushing an element into the Deque.
        // The operation is similar to the operation in the stack.
        // The element gets pushed onto the top of the Deque.
        // It does not return any value.
        // It throws NullPointerException if the passed parameter is null.
        teams.push("Inter Miami CF");
        teams.push("Nashville SC");
        teams.push("New York Red Bulls");

        System.out.println("Fourteenth occurence of ArrayDeque: " + teams); // [New York Red Bulls, Nashville SC, Inter Miami CF, LA Galaxy, Atlanta United, Charlotte FC, Chicago Fire FC, Colorado Rapids, Columbus Crew]

        Iterator<String> iterator = teams.iterator();

        while (iterator.hasNext()) {
            String team = iterator.next();
            System.out.println("Iterating over iterator: " + team);
        }

        teams.clear();

        int size = teams.size();
        System.out.println("Size of the ArrayDeque is " + size + ".");

        try {
            String team = teams.getFirst();
            System.out.println("First team is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            String team = teams.getLast();
            System.out.println("Last team is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            String team = teams.peek();
            System.out.println("Peeked team is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.peekFirst();
            System.out.println("Value of the peekFirst method is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.peekLast();
            System.out.println("Value of the peekLast method is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.remove();
            System.out.println("Value of the remove method is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            boolean isRemoved = teams.remove("FC Dallas");
            System.out.println("Is an MLS Team removed? " + isRemoved + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.removeFirst();
            System.out.println("Value of the removeFirst method is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            String team = teams.removeLast();
            System.out.println("Value of the removeLast method is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            String team = teams.poll();
            System.out.println("Value of polled team is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.pollFirst();
            System.out.println("Value of first polled team is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.pollLast();
            System.out.println("Value of last polled team is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            String team = teams.pop();
            System.out.println("Value of popped team is " + team + ".");
        } catch (NoSuchElementException nsee) {
            System.err.println("Error! " + nsee.toString());
        }

        try {
            teams.push(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }
    }

}
