
public class AnimalShelter {

    public static void main(String[] args) {

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

    }
}

class Animal {
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
