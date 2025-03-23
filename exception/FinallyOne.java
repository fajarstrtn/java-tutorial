
public class FinallyOne {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.err.println("Finally");
        }

        System.out.println("Out of try-catch-finally blocks");

    }

}
