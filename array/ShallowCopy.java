
public class ShallowCopy {

    public static void main(String[] args) {
        int[][] original = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /*
         * Shallow copy means the outer array is new, but the elements still reference the same objects.
         * The clone() method only copies the outer array, inner arrays are still shared references.
         * Use shallow copy if elements are primitives or immutable. */
        int[][] shallowCopy = original.clone();

        original[0][0] = 100_000;

        System.out.println(original[0][0]);    // Output: 100000
        System.out.println(shallowCopy[0][0]); // Output: 100000
    }
}
