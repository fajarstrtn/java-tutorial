
import java.util.List;

public class Superhero {

    protected String name;
    protected String realName;
    protected Integer age;
    protected String originStory;
    protected String universe;
    protected List<String> abilities;

    public Superhero() {
    }

    public Superhero(List<String> abilities, Integer age, String name, String originStory, String realName, String universe) {
        this.abilities = abilities;
        this.age = age;
        this.name = name;
        this.originStory = originStory;
        this.realName = realName;
        this.universe = universe;
    }

}
