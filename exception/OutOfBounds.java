
public class OutOfBounds {

    public static void main(String[] args) {
        var arrays = new int[5];

        try {
            System.out.println(arrays[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

}
