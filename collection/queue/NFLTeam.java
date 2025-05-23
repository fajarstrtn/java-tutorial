
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class NFLTeam {

    private static boolean hasRavens(String team) {
        return team.equalsIgnoreCase("baltimore ravens");
    }

    public static void main(String[] args) {
        // The PriorityQueue class in Java is part of the java.util package.
        // It implements a priority heap-based queue that processes elements based on their priority rather than the FIFO (First-In-First-Out) concept of a Queue.
        // The PriorityQueue is based on the Priority Heap.
        // The elements of the priority queue are ordered according to the natural ordering, and elements must implement Comparable, or by a Comparator provided at queue construction time, depending on which constructor is used.
        // The size of the Priority Queue is dynamic, this means it will increase or decrease as per the requirement.
        Queue<String> teams = new PriorityQueue<>();

        // Inserting the specified element into this priority queue.
        // The insertion order is not retained in the PriorityQueue.
        // The elements are stored based on the priority order which is ascending by default.
        teams.add("Houston Texans");
        teams.add("Dallas Cowboys");
        teams.add("Buffalo Bills");
        teams.add("Chicago Bears");
        teams.add("Baltimore Ravens");

        // You cannot create a PriorityQueue of Objects that are non-comparable.
        // PriorityQueue are unbound queues.
        // The head of this queue is the least element with respect to the specified ordering.
        // Since PriorityQueue is not thread-safe, Java provides PriorityBlockingQueue class that implements the BlockingQueue interface to use in a Java multithreading environment.
        // The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
        // It provides O(log(n)) time for add and poll methods.
        System.out.println("First occurence of the PriorityQueue: " + teams);

        try {
            // PriorityQueue does not permit null.
            teams.add(null);
        } catch (NullPointerException npe) {
            System.err.println("Error! " + npe.toString());
        }

        // This method retrieves and removes the head of this queue, or returns null if this queue is empty.
        String head = teams.poll();
        System.out.println("Value of head (using poll) is " + head + ".");

        System.out.println("Second occurence of the PriorityQueue: " + teams);

        // Queue follows the First In First Out principle, you can access only the head of the queue.
        // To access elements from a priority queue, you can use the peek() method.
        // This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        head = teams.peek();
        System.out.println("Value of head (using peek) is " + head + ".");

        System.out.println("Third occurence of the PriorityQueue: " + teams);

        teams.addAll(new ArrayList<>(Arrays.asList(
                "Atlanta Falcons",
                "Denver Broncos",
                "Cincinnati Bengals",
                "Arizona Cardinals",
                "Cleveland Browns",
                "Carolina Panthers"
        )));

        System.out.println("Fourth occurence of the PriorityQueue: " + teams);

        // To remove an element from a priority queue, you can use the remove method.
        // If there are multiple such objects, then the first occurrence of the object is removed.
        // Apart from that, the poll method is also used to remove the head and return it.
        String removedTeam = teams.remove();
        System.out.println("Removed team is " + removedTeam + ".");

        System.out.println("Fifth occurence of the PriorityQueue: " + teams);

        boolean isPanthersRemoved = teams.remove("Carolina Panthers");
        System.out.println("Is Carolina Panthers removed? " + isPanthersRemoved + ".");

        System.out.println("Sixth occurence of the PriorityQueue: " + teams);

        for (var team : teams) {
            System.out.println("Iterating over enhanced for-loop: " + team);
        }

        Iterator<String> iterator = teams.iterator();

        while (iterator.hasNext()) {
            String team = iterator.next();
            System.out.println("Iterating over iterator: " + team);
        }

        boolean containsCardinals = teams.contains("Arizona Cardinals");
        System.out.println("Is Arizona Cardinals in the NFL? " + containsCardinals + ".");

        boolean containsCertainTeams = teams.containsAll(new ArrayList<>(Arrays.asList("Arizona Cardinals",
                "Denver Broncos",
                "Dallas Cowboys"
        )));
        System.out.println("Are these teams in the NFL? " + containsCertainTeams + ".");

        int size = teams.size();
        System.out.println("Size of the PriorityQueue is " + size + ".");

        teams.offer("Los Angeles Rams");
        teams.offer("Detroit Lions");
        teams.offer("Jacksonville Jaguars");

        System.out.println("Eighth occurence of the PriorityQueue: " + teams);

        teams.removeAll(new ArrayList<>(Arrays.asList(
                "Detroit Lions",
                "Cincinnati Bengals",
                "Buffalo Bills"
        )));

        System.out.println("Ninth occurence of the PriorityQueue: " + teams);

        teams.removeIf(NFLTeam::hasRavens);

        // In Java, the PriorityQueue class is part of the java.util package and is used to implement a priority heap.
        // It orders its elements according to their natural ordering or by a Comparator provided at queue construction time.
        System.out.println("Tenth occurence of the PriorityQueue: " + teams);

        // Cleaning-up elements in the PriorityQueue.
        teams.clear();

        // Checking whether the PriorityQueue is empty or not.
        boolean isEmpty = teams.isEmpty();
        System.out.println("Is the PriorityQueue empty? " + isEmpty + ".");

        try {
            // Use peek/poll method when you're okay with getting null if the queue is empty.
            // It returns the head (highest-priority) element of the queue and returns null if the queue is empty.
            // It does not remove the element.
            String team = teams.peek();
            System.out.println("Value of peeked element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            // It returns the head (highest-priority) element of the queue and returns null if the queue is empty.
            // It removes the element.
            String team = teams.poll();
            System.out.println("Value of polled element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            // Use element/remove method when you expect the queue to always have elements and want to be strict.
            // It returns head (highest-priority) element and throws NoSuchElementException if the queue is empty.
            // It does not remove the element.
            String team = teams.element();
            System.out.println("Value of selected element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }

        try {
            // It returns head (highest-priority) element and throws NoSuchElementException if the queue is empty.
            // It removes the element.
            String team = teams.remove();
            System.out.println("Value of removed element is " + team + ".");
        } catch (Exception e) {
            System.err.println("Error! " + e.toString());
        }
    }

}
