
public class AnotherIncrement {

    public static void main(String[] args) {

        doIncrement(11);
        System.out.println("program successfully executed");

    }

    private static void doIncrement(int number) {

        if (number < 10) {
            System.out.println(++number);
        }
        
    }
}
