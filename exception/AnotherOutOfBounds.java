
public class AnotherOutOfBounds {

    public static void main(String[] args) {
        String name = null;

        try {
            System.out.println(name.length());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        
    }
}
