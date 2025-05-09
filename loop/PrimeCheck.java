
public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (var i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println(isPrime(number) ? "Prime" : "Not Prime");
    }

}
