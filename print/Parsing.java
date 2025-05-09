
public class Parsing {

    public static void main(String[] args) {
        String currentYear = "2024";
        int yearOfBirth = 1998;

        System.out.println("Current age: " + (Integer.parseInt(currentYear) - yearOfBirth) + ".");
        System.out.println("Concated string: " + currentYear + (String.valueOf(yearOfBirth)) + ".");
    }

}
