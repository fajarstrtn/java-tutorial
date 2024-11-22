
public class MultidimentionalArray {

    public static void main(String[] args) {

        int[][] mdIntArray = new int[3][3];

        System.out.println("row of mdArray: " + mdIntArray.length);
        System.out.println("column of mdArray: " + mdIntArray[0].length);

        String[][] mdStringArray = {
            {"japan", "korea", "china"},
            {"singapore", "indonesia", "malaysia"},
            {"england", "nederland", "france"}
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
