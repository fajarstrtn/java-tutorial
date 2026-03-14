
public class Bitwise {

    public static void main(String[] args) {
        int a = 0b1010; // Output: 10
        int b = 0b0011; // Output: 3

        int xor = a ^ b;         // Compares corresponding bits; returns 1 if the bits are different, and 0 if they are the same.
        System.out.println(xor); // Output: 9

        int not = ~a;            // Inverts all bits of a single operand (changes 0 to 1 and 1 to 0).
        System.out.println(not); // Output: -11

        int and = a & b;         // Compares corresponding bits; returns 1 if both bits are 1, otherwise 0.
        System.out.println(and); // Output: 2

        int or = a | b;         // Compares corresponding bits; returns 1 if at least one bit is 1, otherwise 0.
        System.out.println(or); // Output: 11
    }

}
