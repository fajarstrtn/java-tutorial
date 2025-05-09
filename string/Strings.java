
public class Strings {

    public static void main(String[] args) {
        String name = "Jackson Irvine";
        String idCardName = "Jackson Irvine";
        System.out.println("Are " + name + " and " + idCardName + " equal? " + (name == idCardName) + ".");

        String username = "John Hammond";
        String alterEgoName = new String("John Hammond");
        System.out.println("Are " + username + " and " + alterEgoName + " equal? " + (username == alterEgoName) + ".");
        System.out.println("Are " + username + " and " + alterEgoName + " equal? " + (username.equals(alterEgoName)) + ".");

        String aliasName = new String("Blank Tank");
        String anotherAliasName = new String("Blank Tank");
        System.out.println("Are " + aliasName + " and " + anotherAliasName + " equal? " + (aliasName == anotherAliasName) + ".");

        String dogName = "Harold";
        dogName.concat(" Kylie");
        System.out.println(dogName);

        try {
            String city = "Jakarta";

            for (int i = 0; i < city.length(); ++i) {
                System.out.println(city.charAt(i) + " at " + i + " index position.");
            }

            System.out.println("Value at 100 index position is " + city.charAt(100) + ".");
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println(e.toString());
        }
    }

}
