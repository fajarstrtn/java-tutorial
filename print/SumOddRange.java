
public class SumOddRange {

    public static boolean isOdd(int number) {
        boolean result = false;

        if (number > 0) {
            result = number % 2 == 1;
        }

        return result;
    }

    public static int sumOdd(int start, int end) {
        if (start <= 0 || end <= 0) {
            return -1;
        }

        if (end < start) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = sumOdd(1, 10);
        System.out.println(sum);
    }

}
