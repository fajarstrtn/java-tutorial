
public class ArrayDeclaration {

    public static void main(String[] args) {

        int[] intArray = new int[5];

        for (int intArrayValue : intArray) {
            System.out.println(intArrayValue);
        }

        boolean[] booleanArray = new boolean[5];

        for (boolean booleanArrayValue : booleanArray) {
            System.out.println(booleanArrayValue);
        }

        String[] stringArray = new String[5];

        for (String stringArrayValue : stringArray) {
            System.out.println(stringArrayValue);
        }

    }

}
