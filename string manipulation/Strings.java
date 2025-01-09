
public class Strings {

    public static void main(String[] args) {

        String name = "luke hemmings";
        String idCardName = "luke hemmings";

        System.out.println("are " + name + " and " + idCardName + " equal? " + (name == idCardName));

        String username = "john doe";
        String alterEgoName = new String("john doe");

        System.out.println("are " + username + " and " + alterEgoName + " equal? " + (username == alterEgoName));
        System.out.println("are " + username + " and " + alterEgoName + " equal? " + (username.equals(alterEgoName)));

        String aliasName = new String("Black Canary");
        String anotherAliasName = new String("Black Canary");

        System.out.println("are " + aliasName + " and " + anotherAliasName + " equal? " + (aliasName == anotherAliasName));

        String dogName = "Molly";
        
        dogName.concat(" Parker");

        System.out.println(dogName);

    }
}
