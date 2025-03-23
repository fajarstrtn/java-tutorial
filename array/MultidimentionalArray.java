
public class MultidimentionalArray {

    public static void main(String[] args) {

        int[][] mdIntArray = new int[3][3];

        System.out.println("Row of mdArray: " + mdIntArray.length);
        System.out.println("Column of mdArray: " + mdIntArray[0].length);

        String[][] mdStringArray = {
            {"Japan", "Korea", "China"},
            {"Singapore", "Indonesia", "Malaysia"},
            {"England", "Nederland", "France"}
        };

        for (int row = 0; row < mdStringArray.length; ++row) {
            for (int column = 0; column < mdStringArray[row].length; ++column) {
                System.out.print(mdStringArray[row][column]);

                if (column < mdStringArray[row].length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

}
