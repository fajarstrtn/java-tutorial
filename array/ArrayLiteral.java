
public class ArrayLiteral {

    public static void main(String[] args) {
        int[] intValues = {1, 2, 3, 4, 5};

        int size = intValues.length;

        for (int member = 0; member < size; ++member) {
            System.out.println(intValues[member]);
        }
    }

}
