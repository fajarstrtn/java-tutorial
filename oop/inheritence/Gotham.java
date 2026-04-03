
import java.util.List;

class Superhero {

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

class Villain extends Superhero {

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

public class Gotham {

    public static void main(String[] args) {
        Superhero batman = new Superhero();
        batman.name = "The Dark Knight";
        batman.realName = "Bruce Wayne";
        batman.age = 37;
        batman.originStory
                = "After his parents' murder,"
                + " Bruce Wayne became Batman to fight crime"
                + " and protect Gotham City";
        batman.universe = "DC Comics";
        batman.abilities = List.of(
                "Genius-Level Intellect",
                "Martial Arts Mastery",
                "Peak Human Condition",
                "Advanced Technology",
                "Stealth",
                "Wealth and Resources",
                "Intimidation");

        System.out.println(batman.name);
        System.out.println(batman.realName);
        System.out.println(batman.age);
        System.out.println(batman.originStory);
        System.out.println(batman.universe);
        batman.abilities.forEach(System.out::println);

        Villain deathStroke = new Villain();
        deathStroke.name = "Deathstroke";
        deathStroke.realName = "Slade Wilson";
        deathStroke.age = 40;
        deathStroke.originStory = "Slade Wilson, a former mercenary who was experimented on to become a super soldier";
        deathStroke.universe = "DC comics";
        deathStroke.abilities = List.of(
                "Expert Hand-to-Hand Combatant",
                "Master Tactician",
                "Genius Intellect",
                "Enhanced Strength",
                "Healing Factor",
                "Skilled Marksman",
                "Swordsmanship",
                "Stealth"
        );
        deathStroke.isMetaHuman = false;

        System.out.println(deathStroke.name);
        System.out.println(deathStroke.realName);
        System.out.println(deathStroke.age);
        System.out.println(deathStroke.originStory);
        System.out.println(deathStroke.universe);
        deathStroke.abilities.forEach(System.out::println);
    }

}
