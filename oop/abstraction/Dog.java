
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("woof...woof...woof");
    }

    public static void main(String... args) {

        var dog = new Dog();
        dog.makeSound();

    }

}

abstract class Animal {

    private String name;

    public Animal() {
        // no-args constructor
        name = null;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

}
