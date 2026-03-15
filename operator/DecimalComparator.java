
public class DecimalComparator {

    /*
     * The value 1e-9 is used as an epsilon (a small tolerance)
     * when comparing floating-point numbers because it represents the precision
     * at which you are willing to consider two numbers as "equal".
     * 
     * However, the exact value of epsilon depends on
     * the precision required for your application:
     * 1. 1e-6 : Used for situations where precision
     * up to 6 decimal places is acceptable such as basic floating-point calculations.
     * 2. 1e-9 : Used in cases where the application requires precision
     * up to 9 decimal places often seen in scientific or
     * financial calculations requiring high accuracy.
     * 3. 1e-12: This value is typically used for extremely high-precision calculations
     * such as simulations or advanced scientific modeling. */
    public static boolean isEqual(double firstNumber, double lastNumber) {
        double epsilon = 1e-9;
        return (Math.abs(firstNumber - lastNumber) < epsilon);
    }

    public static void main(String[] args) {
        double firstNumber = 10.2782;
        double lastNumber = 10.2782;

        System.out.println(isEqual(firstNumber, lastNumber)); // Output: true
    }

}
