
public class NullPointer {

    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }

    }

}
