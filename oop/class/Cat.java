
public class Cat {

    String name;
    String breed;
    String color;
    int age;

    public static void main(String[] args) {

        Cat mio = new Cat();
        mio.name = "mio";
        mio.breed = "persian";
        mio.color = "white";
        mio.age = 12;

        System.out.println("cat's name: " + mio.name);
        System.out.println("cat's breed: " + mio.breed);
        System.out.println("cat's color: " + mio.color);
        System.out.println("cat's age: " + mio.age);

    }

}
