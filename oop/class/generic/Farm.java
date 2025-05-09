
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class Farm {

    public static void main(String[] args) {
        Groom<Cat> cat = new Groom<>(new Cat());
        cat.call();

        Groom<Dog> dog = new Groom<>(new Dog());
        dog.call();

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        cats.stream().forEach(System.out::println);

        var dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.stream().forEach(System.out::println);
    }

}

// This 'extends' in generics means "is a subtype of" whether it is a class or an interface.
// Java doesn't use implements in generics at all.
// In generics, extends covers both class inheritance and interface implementation.
// Since Groom generic class extends Animal and implements Serializable, both Cat and Dog should extend and implement both of them.
// General form of bounded type parameters: <T extends Class & Interface1 & Interface2 ...>
class Groom<T extends Animal & Serializable> {

    private T animal;

    public Groom() {
        // No-args constructor.
    }

    public Groom(T animal) {
        this.animal = animal;
    }

    public void call() {
        animal.makeSound();
    }

}

class Animal implements Serializable {

    private String name;
    private Double age;
    private Double weight;
    private String species;
    private String breed;
    private String gender;

    public Animal() {
        // No-args constructor.
    }

    public Animal(String name, Double age, Double weight, String species, String breed, String gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.species = species;
        this.breed = breed;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void makeSound() {
        System.out.println("Animal is making its sound.");
    }

}

class Cat extends Animal implements Serializable {

    private Boolean isIndoor;

    public Cat() {
        // No-args constructor.
    }

    public Cat(String name, Double age, Double weight, String species, String breed, String gender, Boolean isIndoor) {
        super(name, age, weight, species, breed, gender);
        this.isIndoor = isIndoor;
    }

    public Boolean getIsIndoor() {
        return isIndoor;
    }

    public void setIsIndoor(Boolean isIndoor) {
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

}

class Dog extends Animal {

    private Boolean isPlayful;

    public Dog() {
        // No-args constructor.
    }

    public Dog(String name, Double age, Double weight, String species, String breed, String gender, Boolean isPlayful) {
        super(name, age, weight, species, breed, gender);
        this.isPlayful = isPlayful;
    }

    public Boolean getIsPlayful() {
        return isPlayful;
    }

    public void setIsPlayful(Boolean isPlayful) {
        this.isPlayful = isPlayful;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

}
