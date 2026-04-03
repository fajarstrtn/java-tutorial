
public class Termination {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        boolean isTerminated = true;

        if (isTerminated) {
            return; // The return statement will stop the program.
        } else {
            System.out.println("Hello World");
        }
    }

}
