
public class AnotherIncrement {

    private static void doIncrement(int number) {
        if (number < 10) {
            System.out.println(++number);
        }
    }

    public static void main(String[] args) {
        doIncrement(11);
        System.out.println("Program is successfully executed.");
    }

}
