
import java.util.Arrays;

public class ExceptionFlowPt2 {

    public static void main(String[] args) {
        var arr = new int[4];

        try {
            var value = arr[4];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.toString());
        } finally {
            // The 'finally' block will be executed regardless of whether an exception occurs in the try block or not.
            System.out.println("Finally block is executed.");
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Program ends.");
    }

}
