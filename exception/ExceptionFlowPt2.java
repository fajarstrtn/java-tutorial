
import java.util.Arrays;

public class ExceptionFlowPt2 {

    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            int value = arr[4];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.toString());
        } finally {
            /* finally keyword will be executed regardless of exception happens in try block or not. */
            System.out.println("Finally block is executed");
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Program ends");

    }

}
