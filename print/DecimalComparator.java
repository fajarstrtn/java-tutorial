public class DecimalComparator {

    public static void main (String[] args) {
        
        System.out.println (areEqualByThreeDecimalPlaces (10.123, 10.124));

    }
    
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double lastNumber) {
        
        int num1 = (int) (firstNumber * 1000);
        int num2 = (int) (lastNumber * 1000);

        return num1 == num2;
        
    }
}