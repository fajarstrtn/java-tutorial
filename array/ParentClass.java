
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

        System.out.println("Data type for byte class: " + byteArray.getClass());
        System.out.println("Data type for short class: " + shortArray.getClass());
        System.out.println("Data type for int class: " + intArray.getClass());
        System.out.println("Data type for long class: " + longArray.getClass());
        System.out.println("Data type for double class: " + doubleArray.getClass());
        System.out.println("Data type for float class: " + floatArray.getClass());
        System.out.println("Data type for char class: " + charArray.getClass());
        System.out.println("Data type for boolean class: " + booleanArray.getClass());
        System.out.println("Data type for String class: " + stringArray.getClass());

        System.out.println("Data type for byte parent class: " + byteArray.getClass().getSuperclass());
        System.out.println("Data type for short parent class: " + shortArray.getClass().getSuperclass());
        System.out.println("Data type for int parent class: " + intArray.getClass().getSuperclass());
        System.out.println("Data type for long parent class: " + longArray.getClass().getSuperclass());
        System.out.println("Data type for double parent class: " + doubleArray.getClass().getSuperclass());
        System.out.println("Data type for float parent class: " + floatArray.getClass().getSuperclass());
        System.out.println("Data type for char parent class: " + charArray.getClass().getSuperclass());
        System.out.println("Data type for boolean parent class: " + booleanArray.getClass().getSuperclass());
        System.out.println("Data type for String parent class: " + stringArray.getClass().getSuperclass());

    }

}
