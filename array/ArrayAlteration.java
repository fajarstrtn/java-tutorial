
public class ArrayAlteration {

    private static int[] passByReference(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; ++i) {
            array[i] = (array[i] * 10) + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        /*
         * Use passByReference(int[] array) method to reveal that
         * changes in that method will affect to its object. */
        passByReference(array);

        for (int value : array) {
            System.out.println(value);
        }
    }

}
