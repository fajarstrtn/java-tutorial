
public class Increment {

    public static void main(String[] args) {

        doIncrement(11);
        System.out.println("program successfully executed");
        
    }

    private static void doIncrement(int value) {

        if (value > 10) {
            System.out.println(++value);
        }

    }
}
