
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
        return "Hi, my name is " + name + " and i am " + age + " years-old";
    }

    public static void main(String[] args) {

        Human jack = new Human();
        jack.name = "Christine Perry";
        jack.age = 28;

        /* Java will automatically call toString method once its instance be printed. */
        logger.log(Level.INFO, jack);

        Human gerard = new Human("Timmy Jenner", 25);
        logger.log(Level.INFO, gerard);

    }

}
