
public class Scopes {

    public static void main(String[] args) {
        int number = 0;

        for (int i = 1; i <= 10; ++i) {
            // Variable 'number' can be recognized as it is declared outside of for-loop block and be used inside its inner loops.
            number += i;
            System.out.println("Loop number: " + i);

        }

        System.out.println("Sum of iteration: " + number);

        // Variable 'i' will not be recognized outside of its block as it is declared inside of for-loop block.
        // 
        // System.out.println("Local variable inside of for-loop: " + i);
        if (number > 0) {
            boolean isGreaterThanZero = true;
            System.out.println(number + " is greater than 0? " + isGreaterThanZero + ".");
        }

        // If you call variable 'isGreaterThanZero' outside of if-block scope than it causes an error.
        // System.out.println(number + " is greater than 0? " + isGreaterThanZero);
    }

}
