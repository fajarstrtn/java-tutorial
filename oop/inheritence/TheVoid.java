
import java.util.List;

public class TheVoid {

    public static void main(String[] args) {

        var batman = new Superhero();
        batman.name = "the dark knight";
        batman.realName = "bruce wayne";
        batman.age = 37;
        batman.originStory = "after his parents' murder, bruce wayne became batman to fight crime and protect gotham.";
        batman.universe = "dc comics";
        batman.abilities = List.of(
                "genius-level intellect",
                "martial arts mastery",
                "peak human condition",
                "advanced technology",
                "stealth",
                "wealth and resources",
                "intimidation");

        System.out.println("superhero's name: " + batman.name);
        System.out.println("superhero's real name: " + batman.realName);
        System.out.println("superhero's age: " + batman.age);
        System.out.println("superhero's origin story: " + batman.originStory);
        System.out.println("superhero's universe: " + batman.universe);
        System.out.println("superhero's abilities, including:");
        batman.abilities.forEach(System.out::println);

        System.out.println("==============================");

        var deathstroke = new Villain();
        deathstroke.name = "deathstroke";
        deathstroke.realName = "slade wilson";
        deathstroke.age = 40;
        deathstroke.originStory = "slade wilson, a former mercenary who was experimented on to become a super soldier.";
        deathstroke.universe = "dc comics";
        deathstroke.abilities = List.of(
                "expert hand-to-hand combatant",
                "master tactician",
                "genius intellect",
                "enhanced strength",
                "healing factor",
                "skilled marksman",
                "swordsmanship",
                "stealth"
        );
        deathstroke.isMetaHuman = false;

        System.out.println("villain's name: " + deathstroke.name);
        System.out.println("villain's real name: " + deathstroke.realName);
        System.out.println("villain's age: " + deathstroke.age);
        System.out.println("villain's origin story: " + deathstroke.originStory);
        System.out.println("villain's universe: " + deathstroke.universe);
        System.out.println("villain's abilities, including:");
        deathstroke.abilities.forEach(System.out::println);

    }

}
