
public class Exceptions {

    public static void main(String[] args) {

        try {
            String value = null;
            System.out.println(value.length());
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.toString());
            System.err.println(e.getMessage());
        }

    }

}
