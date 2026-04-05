
public class CallStack {

    private int computeNumbers(int first, int second) throws NumberFormatException, ArithmeticException {
        return divide(first, second);
    }

    private int divide(int first, int second) throws NumberFormatException, ArithmeticException {
        return first / second;
    }

    public static void main(String[] args) {
        CallStack callStack = new CallStack();

        try {
            int result = callStack.computeNumbers(10, 0);
            System.out.println(result);
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
