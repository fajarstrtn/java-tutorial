
import java.util.Set;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(7);

        System.out.println("First occurence of the NavigableSet: " + numbers);

        Set<Integer> sortedSet = new TreeSet<>();

        sortedSet = numbers.headSet(4);
        System.out.println("The head set is " + sortedSet);

        sortedSet = numbers.headSet(4, true);
        System.out.println("The head set (true) is " + sortedSet);

        sortedSet = numbers.tailSet(4);
        System.out.println("The tail set is " + sortedSet);

        sortedSet = numbers.tailSet(4, false);
        System.out.println("The tail set (true) is " + sortedSet);

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
    }
}