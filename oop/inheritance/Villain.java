
import java.util.List;

public class Villain extends Superhero {

    protected Boolean isMetaHuman;

    public Villain() {
        super();
    }

    public Villain(Boolean isMetaHuman) {
        this.isMetaHuman = isMetaHuman;
    }

    public Villain(Boolean isMetaHuman, List<String> abilities, Integer age, String name, String originStory, String realName, String universe) {
        super(abilities, age, name, originStory, realName, universe);
        this.isMetaHuman = isMetaHuman;
    }

}
