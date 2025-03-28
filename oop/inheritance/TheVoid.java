
import java.util.List;

public class TheVoid {

    public static void main(String[] args) {

        var batman = new Superhero();
        batman.name = "The Dark Knight";
        batman.realName = "Bruce Wayne";
        batman.age = 37;
        batman.originStory = "After his parents' murder, Bruce Wayne became Batman to fight crime and protect Gotham City.";
        batman.universe = "DC Comics";
        batman.abilities = List.of(
                "Genius-Level Intellect",
                "Martial Arts Mastery",
                "Peak Human Condition",
                "Advanced Technology",
                "Stealth",
                "Wealth and Resources",
                "Intimidation");

        System.out.println("Superhero's name: " + batman.name);
        System.out.println("Superhero's real name: " + batman.realName);
        System.out.println("Superhero's age: " + batman.age);
        System.out.println("Superhero's origin story: " + batman.originStory);
        System.out.println("Superhero's universe: " + batman.universe);
        System.out.println("Superhero's abilities, including:");
        batman.abilities.forEach(System.out::println);

        System.out.println("==============================");

        var deathstroke = new Villain();
        deathstroke.name = "Deathstroke";
        deathstroke.realName = "Slade Wilson";
        deathstroke.age = 40;
        deathstroke.originStory = "Slade Wilson, a former mercenary who was experimented on to become a super soldier.";
        deathstroke.universe = "DC comics";
        deathstroke.abilities = List.of(
                "Expert Hand-to-Hand Combatant",
                "Master Tactician",
                "Genius Intellect",
                "Enhanced Strength",
                "Healing Factor",
                "Skilled Marksman",
                "Swordsmanship",
                "Stealth"
        );
        deathstroke.isMetaHuman = false;

        System.out.println("Villain's name: " + deathstroke.name);
        System.out.println("Villain's real name: " + deathstroke.realName);
        System.out.println("Villain's age: " + deathstroke.age);
        System.out.println("Villain's origin story: " + deathstroke.originStory);
        System.out.println("Villain's universe: " + deathstroke.universe);
        System.out.println("Villain's abilities, including:");
        deathstroke.abilities.forEach(System.out::println);

    }

}
