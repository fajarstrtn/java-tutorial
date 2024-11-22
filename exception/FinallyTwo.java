
public class FinallyTwo {

    public static void main(String[] args) {

        int result = divide(10, 5);
        System.out.println(result);

    }

    private static int divide(int first, int second) {

        try {

            int result = first / second;
            return result;

        } catch (Exception e) {

            System.err.println(e.getMessage());

        } finally {

            return 10;

        }
        
    }
}
