
public class MaxValue {

    public static void main(String[] args) {

        int[] array = {1, 10, 5, 4, 90, 19, 2, 0, 4, 5, 6, 99, 10, 11};

        int maxValue = 0;

        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        System.out.println("max value is " + maxValue);
    
    }
}
