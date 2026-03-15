
public class DefaultValue {

    boolean booleanValue;
    byte byteValue;
    short shortValue;
    char charValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    String stringValue;

    public static void main(String[] args) {
        var val = new DefaultValue();

        System.out.println(val.booleanValue); // Output: false
        System.out.println(val.byteValue);    // Output: 0
        System.out.println(val.shortValue);   // Output: 0
        System.out.println(val.charValue);    // Output: 
        System.out.println(val.intValue);     // Output: 0
        System.out.println(val.longValue);    // Output: 0
        System.out.println(val.floatValue);   // Output: 0.0
        System.out.println(val.doubleValue);  // Output: 0.0
        System.out.println(val.stringValue);  // Output: null
    }

}
