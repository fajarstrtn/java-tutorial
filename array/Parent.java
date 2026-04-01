
public class Parent {

    public static void main(String[] args) {
        var byteArray = new byte[5];
        System.out.println(byteArray.getClass());                 // Output: class [B
        System.out.println(byteArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var shortArray = new short[5];
        System.out.println(shortArray.getClass());                 // Output: class [S
        System.out.println(shortArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var intArray = new int[5];
        System.out.println(intArray.getClass());                 // Output: class [I
        System.out.println(intArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var longArray = new long[5];
        System.out.println(longArray.getClass());                 // Output: class [J
        System.out.println(longArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var doubleArray = new double[5];
        System.out.println(doubleArray.getClass());                 // Output: class [D
        System.out.println(doubleArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var floatArray = new float[5];
        System.out.println(floatArray.getClass());                 // Output: class [F
        System.out.println(floatArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var charArray = new char[5];
        System.out.println(charArray.getClass());                 // Output: class [C
        System.out.println(charArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var booleanArray = new boolean[5];
        System.out.println(booleanArray.getClass());                 // Output: class [Z
        System.out.println(booleanArray.getClass().getSuperclass()); // Output: class java.lang.Object

        var stringArray = new String[5];
        System.out.println(stringArray.getClass());                 // Output: class [Ljava.lang.String;
        System.out.println(stringArray.getClass().getSuperclass()); // Output: class java.lang.Object
    }

}
