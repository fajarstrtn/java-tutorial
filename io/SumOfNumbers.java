
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        try {

            double sum = sum();

            System.out.println(sum);

        } catch (RuntimeException e) {

            System.err.println(e.toString());

        }
    }

    private static double sum () throws RuntimeException {

        Scanner input;

        int iterator = 1;
        int sum = 0;

        while (iterator <= 5){

            input = new Scanner(System.in);
            
            System.out.print("input number " + iterator + ": ");

            sum += input.nextDouble();
            
            ++iterator;
        
        }
        
        return sum;
        
    }
}

