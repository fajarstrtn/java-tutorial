
public class Cat {

    String name;
    String breed;
    String color;
    int age;

    public static void main(String[] args) {
        Cat mio = new Cat();
        mio.name = "Mio";
        mio.breed = "Persian";
        mio.color = "White";
        mio.age = 12;

        System.out.println("Cat's name: " + mio.name);
        System.out.println("Cat's breed: " + mio.breed);
        System.out.println("Cat's color: " + mio.color);
        System.out.println("Cat's age: " + mio.age);
    }

}
