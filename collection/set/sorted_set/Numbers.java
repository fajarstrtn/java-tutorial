
import java.util.Set;
import java.util.SortedSet;
import java.util.HashSet;
import java.util.Arrays;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Numbers {

    public static void main(String[] args) {
        // The NavigableSet interface of the Java Collections framework provides the features to navigate among the set elements.
        // It is considered as a type of SortedSet.
        // In order to use the functionalities of the NavigableSet interface, we need to use the TreeSet class that implements NavigableSet.
        // The NavigableSet is considered as a type of SortedSet.
        // It is because NavigableSet extends the SortedSet interface.
        NavigableSet<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(7);
        numbers.add(5);
        numbers.add(10);

        System.out.println("First occurence of the NavigableSet: " + numbers);

        Set<Integer> sortedSet = new TreeSet<>();

        // It returns all the elements of a navigable set before the specified element (which is passed as an argument).
        sortedSet = numbers.headSet(4);
        System.out.println("The head set is " + sortedSet);

        // The booleanValue parameter is optional. Its default value is false.
        // If true is passed as a booleanValue, the method returns all the elements before the specified element including the specified element.
        sortedSet = numbers.headSet(4, true);
        System.out.println("The head set (true) is " + sortedSet);

        // It returns all the elements of a navigable set after the specified element (which is passed as an argument) including the specified element.
        sortedSet = numbers.tailSet(4);
        System.out.println("The tail set is " + sortedSet);

        // The booleanValue parameter is optional. Its default value is true.
        // If false is passed as a booleanValue, the method returns all the elements after the specified element without including the specified element.
        sortedSet = numbers.tailSet(4, false);
        System.out.println("The tail set (true) is " + sortedSet);

        // The subSet() method returns all the elements between e1 and e2 including e1.
        // The bv1 and bv2 are optional parameters.
        // The default value of bv1 is true, and the default value of bv2 is false.
        // If false is passed as bv1, the method returns all the elements between e1 and e2 without including e1.
        // If true is passed as bv2, the method returns all the elements between e1 and e2, including e1.
        sortedSet = numbers.subSet(3, 7);
        System.out.println("Subset of NavigableSet is " + sortedSet);

        sortedSet = numbers.subSet(3, false, 7, false);
        System.out.println("Subset of NavigableSet (3, false, 7, false) is " + sortedSet);

        sortedSet = numbers.subSet(3, false, 7, true);
        System.out.println("Subset of NavigableSet (3, false, 7, true) is " + sortedSet);

        sortedSet = numbers.subSet(3, true, 7, false);
        System.out.println("Subset of NavigableSet (3, true, 7, false) is " + sortedSet);

        sortedSet = numbers.subSet(3, true, 7, true);
        System.out.println("Subset of NavigableSet (3, true, 7, true) is " + sortedSet);

        // It returns and removes the first element from the set.
        Integer pollFirst = numbers.pollFirst();
        System.out.println("Value of pollFirst is " + pollFirst + ".");

        System.out.println("Second occurence of the NavigableSet: " + numbers);

        // It returns and removes the last element from the set.
        Integer pollLast = numbers.pollLast();
        System.out.println("Value of pollLast is " + pollLast + ".");

        System.out.println("Third occurence of the NavigableSet: " + numbers);

        // It returns the lowest element among those elements that are greater than or equal to the specified element.
        Integer ceiling = numbers.ceiling(4);
        System.out.println("Ceiling of 4 is " + ceiling + ".");

        // It returns the greatest element among those elements that are less than or equal to the specified element.
        Integer floor = numbers.floor(4);
        System.out.println("Floor of 4 is " + floor + ".");

        // It returns the lowest element among those elements that are greater than the specified element.
        Integer higher = numbers.higher(7);
        System.out.println("Higher of 7 is " + higher + ".");

        // It returns the greatest element among those elements that are less than the specified element.
        Integer lower = numbers.lower(7);
        System.out.println("Lower of 7 is " + lower + ".");

        // Reversing the order of elements in a set.
        sortedSet = numbers.descendingSet();
        System.out.println("Descending set of sortedSet is " + sortedSet);

        // It returns an iterator that can be used to iterate over a set in reverse order.
        Iterator<Integer> descendingIterator = numbers.descendingIterator();

        while (descendingIterator.hasNext()) {
            Integer number = descendingIterator.next();
            System.out.println("Iterating over descending iterator: " + number);
        }

        NavigableSet<Integer> firstNs = new TreeSet<>(Arrays.asList(6, 5, 9, 7, 8));
        System.out.println("First NavigableSet is " + firstNs);

        NavigableSet<Integer> secondNs = new TreeSet<>(Arrays.asList(5, 4, 1, 3, 2));
        System.out.println("Second NavigableSet is " + secondNs);

        firstNs.addAll(secondNs);
        System.out.println("Union of firstNs and secondNs is " + firstNs);

        firstNs.retainAll(secondNs);
        System.out.println("Intersection of firstNs and secondNs is " + firstNs);

        firstNs.removeAll(secondNs);
        System.out.println("Difference of firstNs and secondNs is " + firstNs);

        // Both the TreeSet as well as the HashSet implements the Set interface.
        // HashSet is faster than the TreeSet for basic operations like add, remove, contains and size.
        Set<Integer> numbers1 = new HashSet<>(Arrays.asList(25, 10, 14, 9, 50));
        System.out.println("HashSet value of numbers1 (unordered): " + numbers1);

        // Unlike HashSet, elements in TreeSet are stored in some order. It is because TreeSet implements the SortedSet interface as well.
        // TreeSet provides some methods for easy navigation. For example, first(), last(), headSet(), tailSet(), etc. It is because TreeSet also implements the NavigableSet interface.
        SortedSet<Integer> numbers2 = new TreeSet<>(Arrays.asList(22, 25, 24, 21, 23));
        System.out.println("TreeSet value of numbers2 (ordered): " + numbers2);
    }
}
