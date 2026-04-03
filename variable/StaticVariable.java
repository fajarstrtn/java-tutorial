
public class StaticVariable {

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
        System.out.println(StaticVariable.booleanValue); // Output: false
        System.out.println(StaticVariable.byteValue);    // Output: 0
        System.out.println(StaticVariable.shortValue);   // Output: 0
        System.out.println(StaticVariable.charValue);    // Output: 
        System.out.println(StaticVariable.intValue);     // Output: 0
        System.out.println(StaticVariable.longValue);    // Output: 0
        System.out.println(StaticVariable.floatValue);   // Output: 0.0
        System.out.println(StaticVariable.doubleValue);  // Output: 0.0
        System.out.println(StaticVariable.stringValue);  // Output: null
    }

}
