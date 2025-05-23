
public class TotalValue {

    private static int getTotalValue(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Total value of an array is " + getTotalValue(array) + ".");
    }

}
