
public class FinallyTwo {

    private static int divide(int first, int second) {
        try {
            return first / second;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            return 10_000;
        }
    }

    public static void main(String[] args) {
        int result = divide(10, 5);
        System.out.println(result);
    }

}
