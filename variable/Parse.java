
public class Parse {

    public static void main(String[] args) {
        String currentYear = "2024";
        int yearOfBirth = 1998;

        System.out.println((Integer.parseInt(currentYear) - yearOfBirth)); // Output: 26
        System.out.println((currentYear + (String.valueOf(yearOfBirth)))); // Output: 20241998
    }

}
