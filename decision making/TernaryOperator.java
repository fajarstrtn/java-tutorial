
public class TernaryOperator {

    public static void main(String[] args) {

        boolean isLamborghiniGood = true;
        String answer = isLamborghiniGood? "This is a good car" : "No, this is bad";

        System.out.println(answer);
        
        String myCar = "Honda Jazz";
        String yourCar = "Tesla Model S";

        System.out.println(myCar.equals(yourCar));
        System.out.println(!myCar.equals(yourCar));
        
   }
}