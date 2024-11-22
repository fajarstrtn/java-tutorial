
public class Precedence {

    public static void main(String[] args) {

        int a = 3;
        int b = 18;
        int c = 9;

        System.out.println("a + b / c is " + (a + b / c));

        int d = 5;
        int e = 8;

        System.out.println("d++ + e is " + (d++ + e));

        int f = 10;
        int g = 5;

        System.out.println("f + g is " + f + g);
        System.out.println("f + g is " + (f + g));
        
    }
}
