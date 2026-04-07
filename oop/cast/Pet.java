
class Animal {

    public void makeSound() {
        System.out.println("An animal is making sound");
    }

}

class Dog extends Animal {

    public void bark() {
        System.out.println("Woof Woof Woof");
    }

}

class Cat extends Animal {

    public void meow() {
        System.out.println("Meow Meow Meow");
    }

}

class Hamster extends Animal {

    public void squeak() {
        System.out.println("Squeak Squeak Squeak");
    }

}

public class Pet {

    public static void main(String[] args) {
        // Downcast an object to Dog class.
        Animal animal = new Dog();
        if (animal instanceof Dog dog) {
            dog.bark();
        }

        animal = new Cat();
        if (animal instanceof Cat cat) {
            cat.meow();
        }

        animal = null;
        if (animal instanceof Hamster hamster) {
            hamster.squeak();
        }

        if (animal == null) {
            System.out.println(animal);
        }

        // Upcast an object to Animal class.
        animal = new Animal();
        if (animal instanceof Animal newAnimal) {
            newAnimal.makeSound();
        }
    }

}
