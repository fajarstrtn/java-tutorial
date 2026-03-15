
public class Unary {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        /*
         * Pre-Increment : Increments first, then uses value.
         * Post-Increment: Uses value first, then increments.
         * 
         * Pre-Decrement : Decrements first, then uses value.
         * Post-Increment: Uses value first, then decrements.
         *
         * If (a++) -> a = 5 -> printed: 5 then computed: 6
         * If (++b) -> b = 8 -> printed: 8 then computed: 8
         * If (a--) -> a = 6 -> printed: 6 then computed: 5
         * If (--b) -> b = 7 -> printed: 7 then computed: 7 */
        System.out.println(a++); // Output: 5
        System.out.println(++b); // Output: 8
        System.out.println(a--); // Output: 6
        System.out.println(--b); // Output: 7

        // Returns the one's complement representation of the input value or operand.
        System.out.println(~a); // Output: -6

        boolean t = true;
        boolean f = false;

        // Used to convert true to false or vice versa.
        System.out.println(!t); // Output: false
        System.out.println(!f); // Output: true

        System.out.println(a);  // Output: 5
        System.out.println(-a); // Output: -5
    }

}
