
public class Assignment {

    public static void main(String[] args) {
        String carName = "VW Golf GTI";

        System.out.println("This is " + carName); // Output: This is VW Golf GTI

        double price;
        int horsePower;

        price = 66_000.234;
        horsePower = 45_000;

        System.out.println("Mine has " + horsePower + " horse power"); // Output: Mine has 45000 horse power
        System.out.println("It costs " + price + " USD");              // Output: It costs 66000.234 USD

        int stock = 50;

        System.out.println(stock += 10);     // Output: 60
        System.out.println(stock -= 10);     // Output: 50
        System.out.println(stock *= 10);     // Output: 500
        System.out.println(stock /= 10);     // Output: 50
        System.out.println(stock %= 10);     // Output: 0
        System.out.println(stock &= 0b1010); // Output: 0
        System.out.println(stock |= 0b1010); // Output: 10
        System.out.println(stock ^= 0b0011); // Output: 9
        System.out.println(stock <<= 2);     // Output: 36
        System.out.println(stock >>= 1);     // Output: 18
        System.out.println(stock >>>= 1);    // Output: 9
    }

}
