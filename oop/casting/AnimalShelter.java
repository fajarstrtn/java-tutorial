
public class AnimalShelter {

    public static void main(String[] args) {

        /* Downcasting to Dog class. */
        Animal animal = new Dog();

        if (animal instanceof Dog dog)
            dog.bark();

        animal = new Cat();

        if (animal instanceof Cat cat)
            cat.meow();

        animal = null;

        if (animal instanceof Crocodile crocodile)
            crocodile.sneak();

        if (animal == null)
            System.out.println(animal);

        /* Upcasting to Animal class. */
        animal = new Animal();

        if (animal instanceof Animal newAnimal)
            newAnimal.makeSound();

    }
}

class Animal {

    public void makeSound() {
        System.out.println("an animal is making its sound");
    }

}

class Dog extends Animal {

    public void bark() {
        System.out.println("woof... woof...");
    }

}

class Cat extends Animal {

    public void meow() {
        System.out.println("meow... meow...");
    }

}

class Crocodile extends Animal {

    public void sneak() {
        System.out.println("blups... blups...");
    }

}
