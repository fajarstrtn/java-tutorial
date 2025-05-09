
public class PrecedenceOperator {

    public static void main(String[] args) {
        double firstNumber = 20;
        double secondNumber = 80;
        double result = ((firstNumber + secondNumber) * 100) % 40;
        System.out.println(result);

        boolean isResultContainingZero = result == 0;
        System.out.println(isResultContainingZero);

        if (!isResultContainingZero) {
            System.out.println("Got some remainder.");
        }
    }

}
