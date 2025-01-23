
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Cat {

    private static final Logger logger = System.getLogger(Cat.class.getName());

    String name;

    String breed;

    int age;

    String color;

    public Cat() {

    }

    public Cat(String name, String breed, int age, String color) {

        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;

    }

    public boolean isPersian() {

        return this.breed.equalsIgnoreCase("persian");

    }

    @Override
    public String toString() {

        return this.name + "-" + this.breed + "-" + this.age + "-" + this.color;

    }

    public static void main(String[] args) {

        Cat mio = new Cat();

        mio.name = "mio";
        mio.breed = "persian";
        mio.age = 12;
        mio.color = "white";

        logger.log(Level.INFO, mio);
        logger.log(Level.INFO, "mio is persian cat, isn't it? " + mio.isPersian());

        Cat jolly = new Cat("jolly", "siamese", 9, "white");

        logger.log(Level.INFO, jolly);
        logger.log(Level.INFO, "jolly is persian cat, isn't it? " + jolly.isPersian());

    }

}
