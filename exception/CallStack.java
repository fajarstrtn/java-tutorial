
public class CallStack {

    public static void main(String[] args) {

        CallStack callStack = new CallStack();

        try {
            int result = callStack.computeNumbers(10, 0);
            System.out.println(result);
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        }

    }

    private int computeNumbers(int first, int second) throws NumberFormatException, ArithmeticException {

        int result = divide(first, second);
        return result;

    }

    private int divide(int first, int second) throws NumberFormatException, ArithmeticException {

        int result = first / second;
        return result;
        
    }
}
