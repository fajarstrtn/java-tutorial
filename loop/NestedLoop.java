
public class NestedLoop {

    public static void main(String[] args) {
        for (var i = 1; i <= 5; ++i) {
            for (var j = 1; j <= i; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
