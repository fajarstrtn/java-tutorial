
public class Precedence {

    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6, g = 7;

        System.out.println("a + b / c is " + (a + b / c));
        System.out.println("d++ + e is " + (++d + e));
        System.out.println("f + g is " + f + g);
        System.out.println("f + g is " + (f + g));

    }
}
