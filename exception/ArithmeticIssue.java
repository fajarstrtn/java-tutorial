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

    private static int computeNumbers(int firstNumber, int secondNumber) throws ArithmeticException {

        try {
            
            int result = firstNumber / secondNumber;
            return result;

        } catch (ArithmeticException e) {

            throw e;

        } finally {

/*          This 'return' statement will discard the result of execution,
            regardless of it succeeds or fails */
            return 10_000;

        }

    }
}