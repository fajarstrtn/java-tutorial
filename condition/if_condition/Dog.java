
public class Dog {

    public static boolean wakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            return false;
        }

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return hourOfDay < 8 || hourOfDay > 22;
    }

    public static void main(String[] args) {
        System.out.println(wakeUp(true, 1));  // Output: true
        System.out.println(wakeUp(false, 8)); // Output: false
        System.out.println(wakeUp(true, -1)); // Output: false
    }

}
