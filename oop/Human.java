
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Human {

    private static final Logger logger = System.getLogger(Human.class.getName());

    public String name;

    public Integer age;

    public Human() {

    }

    public Human(String name, Integer age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {

        return "hi, my name is " + this.name + " and i am " + this.age + " years-old";

    }

    public static void main(String[] args) {

        Human jack = new Human();

        jack.name = "jack hummings";
        jack.age = 28;

        logger.log(Level.INFO, jack);

        Human gerard = new Human("gerard way", 25);

        logger.log(Level.INFO, gerard);

    }
}
