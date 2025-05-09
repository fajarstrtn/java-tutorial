
public class Exceptions {

    public static void main(String[] args) {
        try {
            String value = null;
            System.out.println(value.length());
        } catch (Exception e) {
            System.err.println(e.toString());
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
