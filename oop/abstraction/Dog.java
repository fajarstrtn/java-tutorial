
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof... Woof... Woof...");
    }

    public static void main(String... args) {
        var dog = new Dog();
        dog.makeSound();
    }

}

abstract class Animal {

    private String name;

    protected Animal() {
        name = null;
    }

    protected Animal(String name) {
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
