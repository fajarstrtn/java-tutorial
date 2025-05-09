
import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] arrayOne = {1, 2, 3, 4, 5};
        int[] arrayTwo = {6, 7, 8, 9, 10};

        // This "public static void arraycopy(Object source_arr, int sourcePos, Object dest_arr, int destPos, int len)" has:
        // 
        // Parameters:
        // 1. source_arr: array to be copied from.
        // 2. sourcePos: starting position in source array from where to copy.
        // 3. dest_arr: array to be copied in.
        // 4. destPos: starting position in destination array, where to copy in.
        // 5. len: total no. of components to be copied.
        // 
        // Referring to the below example, as you can see:
        // 
        // Result:
        // arrayOne: {1,2,3,4,5}
        // index: 0, len: 3
        // first result: {1,2,3}
        // 
        // Result:
        // arrayTwo: {6,7,8,9,10}
        // index: 2
        // final result: {6,7,1,2,3}
        System.arraycopy(arrayOne, 0, arrayTwo, 2, 3);

        for (int value : arrayTwo) {
            System.out.print(value + " ");
        }

        System.out.println();

        // Result:
        // arrayThree: {11,12,13,14,15}
        // arrayFour: {11,12,13,14,15}
        int[] arrayThree = {11, 12, 13, 14, 15}, arrayFour = Arrays.copyOf(arrayThree, arrayThree.length);

        for (int value : arrayFour) {
            System.out.print(value + " ");
        }

        System.out.println();

        // Result:
        // arrayThree: {11,12,13,14,15}
        // final result: {12,13,14}
        int[] arrayFive = Arrays.copyOfRange(arrayThree, 1, 4);

        for (int value : arrayFive) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

}
