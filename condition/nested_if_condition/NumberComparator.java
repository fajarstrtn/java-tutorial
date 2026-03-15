
public class NumberComparator {

    public static void main(String[] args) {
        int firstNumber = -10;
        int lastNumber = 50;

        if (firstNumber > 0) {
            if (firstNumber > lastNumber) {
                System.out.println(firstNumber + " is bigger than " + lastNumber);
            } else if (firstNumber < lastNumber) {
                System.out.println(firstNumber + " is smaller than " + lastNumber);
            } else {
                System.out.println(firstNumber + " equals to " + lastNumber);
            }
        } else {
            System.out.println(firstNumber + " is lower than 0");
        }
    }

}
