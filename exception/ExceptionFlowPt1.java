
import java.util.Arrays;

public class ExceptionFlowPt1 {

    public static void main(String[] args) {

        int[] arr = new int[4];

        try {
            /* int value = arr[3]; will not cause an exception. */
            int value = arr[4];

            /* The program throws an exception to catch block and line of code below will not be executed. */
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            /* The exception object get handled by catch block. */
            System.err.println(e.getMessage());
        }

        /* After handling an exception in catch block, the program continues to the rest of the program. */
        System.out.println(Arrays.toString(arr));
        System.out.println("Program ends");

    }

}
