
public class VariableScope {

    public static void main(String[] args) {
        int number = 0;

        for (int i = 1; i <= 10; ++i) {
            /*
             * The number variable can be recognized as it is declared
             * outside of for-loop block and be used inside its inner loops. */
            number += i;
            System.out.println("Loop number: " + i);

        }

        System.out.println("Sum of iteration: " + number);

        /*
         * The i variable will not be recognized outside of its block
         * as it is declared inside of for-loop block. */
        if (number > 0) {
            boolean isGreaterThanZero = true;
            System.out.println(number + " is greater than 0? " + isGreaterThanZero);
        }

        /*
         * If you call the isGreaterThanZero variable
         * outside of if-block scope than it causes an error.
         * 
         * Syntax:
         * System.out.println(number + " is greater than 0? " + isGreaterThanZero); */
        System.out.println("Program is successfully executed");
    }

}
