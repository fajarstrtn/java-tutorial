
import java.util.List;

public class Superhero {

    public String name;

    public String realName;

    public Integer age;

    public String originStory;

    public String universe;

    public List<String> abilities;

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
