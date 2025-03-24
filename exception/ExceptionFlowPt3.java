
public class ExceptionFlowPt3 {

    public static void main(String[] args) {

        try {
            /* Java will terminate the program abnormally when user does not define the suitable exception.
            All the rest of the program will not be executed. */
            int value = calculateNumber(10, 0);
            System.out.println(value);
        } catch (NullPointerException e) {
            System.err.println(e.toString());
        }

        System.out.println("Program ends");

    }

    /* This calculateNumber method adds an ArithmeticException method signature,
    where the caller of this method should handle the same exception as its declared.
    
    But as user can see, there is no catch block which handles ArithmeticException.
    Instead, there is only NullPointerException which exactly does not match with the appropriate exception.
    Then, Java will throw the exception object to the default exception handler.
    
    User's better off not declaring method signature for unchecked exception as it is no use at all. */
    private static int calculateNumber(int firstNumber, int secondNumber) throws ArithmeticException {

        return firstNumber / secondNumber;

    }

}
