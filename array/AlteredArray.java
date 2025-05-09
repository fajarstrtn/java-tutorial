
public class AlteredArray {

    private static int[] passByReference(int[] array) {
        int size = array.length;

        for (int member = 0; member < size; ++member) {
            array[member] = (array[member] * 10) + 1;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Use 'passByReference(int[] array)' to reveal that changes in that method will affect to its object.
        passByReference(array);

        for (int newValue : array) {
            System.out.println(newValue);
        }
    }

}
