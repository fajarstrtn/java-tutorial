
public class Cat {

    String name;
    String breed;
    String color;
    int age;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Cosmo";
        cat.breed = "Scottish Fold";
        cat.color = "Grey";
        cat.age = 5;
        System.out.println(cat.name);  // Output: Cosmo
        System.out.println(cat.breed); // Output: Scottish Fold
        System.out.println(cat.color); // Output: Grey
        System.out.println(cat.age);   // Output: 5
    }

}
