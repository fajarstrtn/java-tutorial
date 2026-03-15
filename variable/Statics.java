
public class Statics {

    public static boolean booleanValue;
    public static byte byteValue;
    public static short shortValue;
    public static char charValue;
    public static int intValue;
    public static long longValue;
    public static float floatValue;
    public static double doubleValue;
    public static String stringValue;

    public static void main(String[] args) {
        System.out.println(Statics.booleanValue); // Output: false
        System.out.println(Statics.byteValue);    // Output: 0
        System.out.println(Statics.shortValue);   // Output: 0
        System.out.println(Statics.charValue);    // Output: 
        System.out.println(Statics.intValue);     // Output: 0
        System.out.println(Statics.longValue);    // Output: 0
        System.out.println(Statics.floatValue);   // Output: 0.0
        System.out.println(Statics.doubleValue);  // Output: 0.0
        System.out.println(Statics.stringValue);  // Output: null
    }

}
