
public class DifferentLoops {

    public static void main(String[] args) {
        for (var i = 1; i <= 5; ++i) {
            System.out.println(i);
        }

        var j = 1;

        while (j <= 5) {
            System.out.println(j);
            ++j;
        }
    }

}
