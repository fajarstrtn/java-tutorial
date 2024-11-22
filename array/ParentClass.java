
public class ParentClass {

    public static void main(String[] args) {

        byte[] byteArray = new byte[5];
        short[] shortArray = new short[5];
        int[] intArray = new int[5];
        long[] longArray = new long[5];
        double[] doubleArray = new double[5];
        float[] floatArray = new float[5];
        char[] charArray = new char[5];
        boolean[] booleanArray = new boolean[5];
        String[] stringArray = new String[5];

        System.out.println("byte class: " + byteArray.getClass());
        System.out.println("short class: " + shortArray.getClass());
        System.out.println("int class: " + intArray.getClass());
        System.out.println("long class: " + longArray.getClass());
        System.out.println("double class: " + doubleArray.getClass());
        System.out.println("float class: " + floatArray.getClass());
        System.out.println("char class: " + charArray.getClass());
        System.out.println("boolean class: " + booleanArray.getClass());
        System.out.println("String class: " + stringArray.getClass());

        System.out.println("byte parent class: " + byteArray.getClass().getSuperclass());
        System.out.println("short parent class: " + shortArray.getClass().getSuperclass());
        System.out.println("int parent class: " + intArray.getClass().getSuperclass());
        System.out.println("long parent class: " + longArray.getClass().getSuperclass());
        System.out.println("double parent class: " + doubleArray.getClass().getSuperclass());
        System.out.println("float parent class: " + floatArray.getClass().getSuperclass());
        System.out.println("char parent class: " + charArray.getClass().getSuperclass());
        System.out.println("boolean parent class: " + booleanArray.getClass().getSuperclass());
        System.out.println("String parent class: " + stringArray.getClass().getSuperclass());
        
    }
}
