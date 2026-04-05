
public class ArithmeticIssue {

    // This method may throw ArithmeticException, e.g., division by zero.
    // The 'throws' clause indicates that the method does not handle this exception internally.
    private static int computeNumbers(int firstNumber, int secondNumber) throws ArithmeticException {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            // The exception object will be thrown out of this block to the caller of this method.
            // Since the 'finally' returns a value, this won't happen.
            throw e;
        } finally {
            // This 'return' statement will discard the result of execution, regardless of it succeeds or fails.
            return 10_000;
        }
    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 0;

        try {
            int result = computeNumbers(firstNumber, secondNumber);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

}
