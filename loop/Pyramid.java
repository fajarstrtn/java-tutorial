
public class Pyramid {

    public static void main(String[] args) {
        var loop = 10;

        for (var i = 1; i <= loop; ++i) {
            for (var j = loop - i; j > 0; --j) {
                System.out.print(" ");
            }

            for (var k = 1; k <= (i + (i - 1)); ++k) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
