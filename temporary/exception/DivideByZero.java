
public class DivideByZero {

    public static void main(String[] args) {
        int a = 5, b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println(e.toString());
            e.printStackTrace();
        }
    }

}
