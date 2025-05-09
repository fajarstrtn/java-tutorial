
public class Increment {

    private static void doIncrement(int value) {
        if (value > 10) {
            System.out.println(++value);
        }
    }

    public static void main(String[] args) {
        doIncrement(11);
        System.out.println("Program is successfully executed.");
    }

}
