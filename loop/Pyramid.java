
public class Pyramid {

    public static void main(String[] args) {

        int loop = 10;

        for (int i = 1; i <= loop; ++i) {
            for (int j = loop - i; j > 0; --j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i + (i - 1)); ++k) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
