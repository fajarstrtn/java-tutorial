
// Every class in Java is part of object class. it is the root of inheritance in Java.
public class Fruit {

    String name;
    String color;
    double price;

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Blueberry";
        fruit.color = "Blue";
        fruit.price = 0.5;
        System.out.println(fruit.toString());
        System.out.println(fruit.hashCode());
    }

}
