
public class InterestRate {

    public static void main(String[] args) {

        double amount = 10_000;

        for (double rate = 1.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(amount, rate);
            System.out.println(amount + " at " + rate + "% interest = " + interestAmount);
        }

    }

    private static double calculateInterest(double amount, double rate) {

        return (amount * (rate / 100));

    }

}
