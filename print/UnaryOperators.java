
public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10, b = -20;
        System.out.println("a + b is " + (a + b));

        a = -a;
        System.out.println("a is converted to minus becoming " + a);

        int c = 5, d = 7;

        /* Post-Increment: value is first used for computing the result, then incremented.
        Pre-Decrement: value is first incremented, then the result is computed.

        (c++) -> c = 5 -> printed: 5, computed: 6.
        (++c) -> c = 6 -> printed: 7, computed: 7.

        (d--) -> d = 7 -> printed: 7, computed: 6.
        (--d) -> d = 6 -> printed: 5, computed: 5. */
        System.out.println("c++ is " + c++);
        System.out.println("++c is " + ++c);
        System.out.println("d-- is " + d--);
        System.out.println("--d is " + --d);

        /* Bitwise complement operator (~) returns the one's complement
        representation of the input value or operand. */
        int e = 5;
        e = ~e;
        System.out.println("Bitwise complement of 5 is " + e);

        /* Logical not (!) operator is used to convert true to false or vice versa. */
        System.out.println("!true is " + (!true));
        System.out.println("!false is " + (!false));

    }
}
