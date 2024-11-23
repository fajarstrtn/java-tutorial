
public class DogShelter {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[3];

        dogs[0] = new Dog("Bailey", "Pitbull", 2);
        dogs[1] = new Dog("Jamie", "Dalmatian", 3);
        dogs[2] = new Dog("Berkshire", "Chihuahua", 1);

        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }

/*      Clone the existing array since the elements are objects, it performs shallow copy. */
        Dog[] shelteredDogs = dogs.clone();

        System.out.println(dogs == shelteredDogs);
        System.out.println(dogs[0] == shelteredDogs[0]);

    }
}

class Dog {

    private String name;

    private String race;

    private int age;

    public Dog(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getRace() {
        return this.race;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
