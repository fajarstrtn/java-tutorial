
public class ArrayReturn {

    private static int[] get() {
        return new int[]{1, 2, 3, 4, 5};
    }

    public static void main(String[] args) {
        /*
         * Advantages of Java Arrays:
         * 1. Efficient Access : Accessing an element by its index
         * is fast and has constant time complexity, O(1).
         * 2. Memory Management: Arrays have fixed size,
         * which makes memory management straightforward and predictable.
         * 3. Data Organization: Arrays help organize data in a structured manner,
         * making it easier to manage related elements.
         * 
         * Disadvantages of Java Arrays:
         * 1. Fixed Size            : Once an array is created, its size cannot be changed,
         * which can lead to memory waste if the size is overestimated or insufficient storage if underestimated.
         * 2. Type Homogeneity      : Arrays can only store elements of the same data type,
         * which may require additional handling for mixed types of data.
         * 3. Insertion and Deletion: Inserting or deleting elements,
         * especially in the middle of an array, can be costly as it may require shifting elements. */
        var array = get();

        for (int value : array) {
            System.out.println(value);
        }
    }

}
