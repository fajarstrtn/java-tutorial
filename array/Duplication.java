
import java.util.Arrays;

public class Duplication {

    private static void doWithArrayCopy() {
        /*
         * The "public static void arraycopy(Object source, int source_pos, Object dest, int dest_pos, int len)"
         * has parameters:
         * 1. source    : Array to be copied from
         * 2. source_pos: Starting position in source array from where to copy
         * 3. dest      : Array to be copied in
         * 4. dest_pos  : Starting position in destination array, where to copy in
         * 5. len       : Total no. of components to be copied
         * 
         * Referring to the below example:
         * 1. originalArray: new int[]{1, 2, 3, 4, 5},
         * where index: 0 and len: 3, then first result: {1,2,3}.
         * 2. copiedArray  : new int[]{6, 7, 8, 9, 10},
         * where index: 2, then final result: {6,7,1,2,3}. */
        var originalArray = new int[]{1, 2, 3, 4, 5};
        var copiedArray = new int[]{6, 7, 8, 9, 10};
        System.arraycopy(originalArray, 0, copiedArray, 2, 3);
        print(copiedArray);
    }

    private static void doWithCopyOf() {
        var originalArray = new int[]{11, 12, 13, 14, 15};
        var copiedArray = Arrays.copyOf(originalArray, originalArray.length);
        print(copiedArray);
    }

    private static void doWithCopyOfRange() {
        var originalArray = new int[]{11, 12, 13, 14, 15};
        int[] copiedArray = Arrays.copyOfRange(originalArray, 1, 4);
        print(copiedArray);
    }

    private static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doWithArrayCopy();
        doWithCopyOf();
        doWithCopyOfRange();
    }

}
