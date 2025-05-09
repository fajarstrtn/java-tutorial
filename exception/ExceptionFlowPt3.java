
public class ExceptionFlowPt3 {

    // This calculateNumber method declares that it may throw an ArithmeticException.
    // However, the caller does not catch ArithmeticException — only NullPointerException is handled.
    // As a result, if an ArithmeticException occurs, it will be thrown to the default exception handler,
    // and the program will terminate abnormally before completing the remaining statements.
    //
    // Note: Declaring unchecked exceptions (like ArithmeticException) in the method signature is unnecessary,
    // since they are not required to be caught or declared.
    private static int calculateNumber(int firstNumber, int secondNumber) throws ArithmeticException {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        try {
            // If a suitable exception is not caught, Java will terminate the program abnormally.
            // Consequently, any code after the exception is not executed.
            int value = calculateNumber(10, 0);
            System.out.println(value);
        } catch (NullPointerException e) {
            System.err.println(e.toString());
        }

        System.out.println("Program ends.");
    }

}
