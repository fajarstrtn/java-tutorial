
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
        return "Hi! My name is " + name + " and I\'m " + age + " years-old";
    }

    public static void main(String[] args) {
        Human person1 = new Human();

        person1.name = "John Doe";
        person1.age = 25;

        logger.log(Level.INFO, person1); // Output: Apr 03, 2026 7:08:35 PM Human main\nINFO: Hi! My name is John Doe and I'm 25 years-old

        Human person2 = new Human("Jane Doe", 25);

        // Java will automatically call toString() method once the instance gets printed.
        logger.log(Level.INFO, person2); // Output: Apr 03, 2026 7:08:35 PM Human main\nINFO: Hi! My name is Jane Doe and I'm 25 years-old
    }

}
