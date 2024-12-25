
public class DivisibleBy3And5 {

    public static void main(String[] args) {

        int number = 15;

        if (isOutOfRange(number)) {

            System.out.println("Invalid Value");
            return;

        }

        int sum = 0;

        for (int i = 1; i <= number; ++i) {

            if (i % 3 == 0) {

                sum = sumAndPrintNumber(sum, i, 3);

            } else if (i % 5 == 0) {

                sum = sumAndPrintNumber(sum, i, 5);

            }
        }

        System.out.println("Total sum: " + sum);

    }

    private static int sumAndPrintNumber(int sum, int i, int divNum) {

        sum += i;
        System.out.println(i + " is divisible by " + divNum);

        return sum;

    }

    private static boolean isOutOfRange(int number) {

        return number < 1 || number > 1000;

    }
}
