
public class Precedence {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;

        System.out.println((a + b / c));        // Output: 1
        System.out.println((++d + e));          // Output: 10
        System.out.println((f + g));            // Output: 13
        System.out.println("f + g = " + f + g); // Output: f + g = 67

        double h = 20;
        double i = 80;
        double j = ((h + i) * 100) % 40;

        System.out.println(j); // Output: 0.0

        boolean containsZero = (j == 0);

        System.out.println(containsZero); // Output: true

        if (!containsZero) {
            System.out.println("Get some remainder");
        }
    }

}
