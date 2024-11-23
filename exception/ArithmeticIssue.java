
public class ArithmeticIssue {

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

/*  This 'throws' indicates that the caller of this method should throw the suitable exception.
    This is a method signature, it also can be one or more exceptions. */
    private static int computeNumbers(int firstNumber, int secondNumber) throws ArithmeticException {

        try {

            int result = firstNumber / secondNumber;
            return result;

        } catch (ArithmeticException e) {

/*          The exception object will be thrown out of this block to the caller of this method.
            Since the 'finally' returns a value, this won't happen. */
            throw e;

        } finally {

/*          This 'return' statement will discard the result of execution,
            regardless of it succeeds or fails. */
            return 10_000;

        }

    }
}
