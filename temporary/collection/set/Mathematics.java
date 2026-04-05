
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Mathematics {

    private static HashSet<Integer> initFirstSet() {
        return new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );
    }

    private static HashSet<Integer> initSecondSet() {
        return new HashSet<>(
                Arrays.asList(3, 4, 5, 6, 7)
        );
    }

    public static void main(String[] args) {
        Set<Integer> numbers;
        Set<Integer> anotherNumbers;

        numbers = initFirstSet();
        anotherNumbers = initSecondSet();

        numbers.retainAll(anotherNumbers);
        System.out.println("Intersection of two sets: " + numbers); // [3, 4, 5]

        numbers = initFirstSet();
        anotherNumbers = initSecondSet();

        numbers.addAll(anotherNumbers);
        System.out.println("Union of two sets: " + numbers); // [1, 2, 3, 4, 5, 6, 7]

        numbers = initFirstSet();
        anotherNumbers = initSecondSet();

        numbers.removeAll(anotherNumbers);
        System.out.println("Difference of two sets: " + numbers); // [1, 2]
    }

}
