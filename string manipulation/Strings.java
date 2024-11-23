
public class Strings {

    public static void main(String[] args) {

        String name = "Fajar Satriatna";
        System.out.println(name);

        String nameInIdCard = "Fajar Satriatna";
        System.out.println(nameInIdCard);
        System.out.println("Identical? " + (name == nameInIdCard));

        String aliasName = new String("Black Canary");
        System.out.println(aliasName);

        String anotherAliasName = new String("Black Canary");
        System.out.println(anotherAliasName);
        System.out.println("Identical? " + (aliasName == anotherAliasName));

        String dogName = "Molly";
        dogName.concat(" Parker");
        System.out.println(dogName);

    }
}
