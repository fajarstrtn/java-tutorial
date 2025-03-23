
import java.util.Arrays;
import java.util.HashSet;

public class FilteredArray {

    private static void filter(int[] array) {

        HashSet<Integer> set = new HashSet<>();

        for (int value : array) {
            set.add(value);
        }

        Integer[] newArray = new Integer[set.size()];
        set.toArray(newArray);

        /* Streamline the newArray to map to integer, then give it back to filteredArray. */
        int[] filteredArray = Arrays.stream(newArray).mapToInt(Integer::intValue).toArray();

        for (int newFilteredValue : filteredArray) {
            System.out.println(newFilteredValue);
        }

    }

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 6, 7, 8, 9, 10};
        filter(array);

    }

}
