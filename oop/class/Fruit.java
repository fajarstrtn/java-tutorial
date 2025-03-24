
/* Every class in Java is part of object class. it is the root of inheritence in Java. */
public class Fruit {

    String name;
    String color;
    double price;

    public static void main(String[] args) {

        Fruit blueberry = new Fruit();
        blueberry.name = "Blueberry";
        blueberry.color = "Blue";
        blueberry.price = 0.5;

        System.out.println(blueberry.toString());
        System.out.println(blueberry.hashCode());

    }

}
