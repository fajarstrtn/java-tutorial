
public class The2DArray {

    public static void main(String[] args) {
        int[][] array = new int[3][3];

        System.out.println(array.length);
        System.out.println(array[0].length);

        String[][] stringArray = {
            {"Japan", "Korea", "China"},
            {"Singapore", "Indonesia", "Malaysia"},
            {"England", "Nederland", "France"}
        };

        for (int r = 0; r < stringArray.length; ++r) {
            for (int c = 0; c < stringArray[r].length; ++c) {
                System.out.print(stringArray[r][c]);
                if (c < stringArray[r].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
