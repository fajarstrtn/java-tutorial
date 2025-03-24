
public class OddAndEven {

    public static void main(String[] args) {

        int number = 2015;
        int validatedNumber = validate(number);

        if (number != validatedNumber && validatedNumber == -1) {
            return;
        }
        print(validatedNumber);

    }

    private static int validate(int number) {

        if (number < 0 || number > 9999) {
            System.out.println("Invalid value");
            return -1;
        }
        return number;

    }

    private static void print(int validatedNumber) {

        if (validatedNumber % 2 == 0) {
            System.out.println(validatedNumber + " is even"); 
        } else {
            System.out.println(validatedNumber + " is odd");
        }

    }

}
