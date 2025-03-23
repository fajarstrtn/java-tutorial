
public class DeepCopy {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        /* Clone the existing array, this will apply deep copy as the values are primitive data types. */
        int[] clonedArray = array.clone();
        clonedArray[0] = 100;

        System.out.println(array == clonedArray);

        int size = clonedArray.length;

        for (int member = 0; member < size; ++member) {
            System.out.println(array[member]);
        }

        for (int member = 0; member < size; ++member) {
            System.out.println(clonedArray[member]);
        }

    }

}
