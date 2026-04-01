
public class DeepCopy {

    public static void main(String[] args) {
        int[][] original = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        /*
         * Deep copy means everything is copied, including nested elements.
         * It behaves completely independent.
         * Use deep copy if arrays contain objects or nested arrays. */
        int[][] deepCopy = new int[original.length][];

        for (int i = 0; i < original.length; ++i) {
            deepCopy[i] = original[i].clone();
        }

        original[0][0] = 100_000;

        System.out.println(original[0][0]); // Output: 100000
        System.out.println(deepCopy[0][0]); // Output: 1
    }

}
