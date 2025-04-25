
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FootballClub {

    public static void main(String[] args) {

        List<Integer> squadNumbers = new ArrayList<Integer>();
        squadNumbers.add(1);
        squadNumbers.add(10);
        squadNumbers.add(15);
        squadNumbers.add(7);
        squadNumbers.add(9);

        Consumer<List<Integer>> modifiedSquadNumbers = numbers -> {
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) * i);
            }
        };

        Consumer<List<Integer>> printedSquadNumbers = numbers -> numbers.stream().forEach(System.out::println);

        try {

            // Demonstrate when NullPointerException is returned.
            // modifiedSquadNumbers.andThen(null).accept(squadNumbers);
            // 
            // Demonstrate how an Exception in the after function is returned and handled.
            // Consumer<List<Integer>> anotherModifiedSquadNumbers = numbers -> {
            //     for (int i = 0; i <= numbers.size(); i++) {
            //         numbers.set(i, numbers.get(i) * i);
            //     }
            // };
            // printedSquadNumbers.andThen(anotherModifiedSquadNumbers).accept(squadNumbers);
            // 
            // Implement andThen functional interface. 
            modifiedSquadNumbers.andThen(printedSquadNumbers).accept(squadNumbers);

        } catch (NullPointerException npe) {
            System.out.println(npe.toString());
        }

        // BiConsumer takes two arguments.
        BiConsumer<String, Integer> displayPlayer = (name, squadNumber) -> System.out.println(name + ": " + squadNumber);
        displayPlayer.accept("Christiano Ronaldo", 7);

        List<Integer> newPlayersSpeed = new ArrayList<>();
        newPlayersSpeed.add(10);
        newPlayersSpeed.add(13);
        newPlayersSpeed.add(24);
        newPlayersSpeed.add(27);

        List<Integer> oldPlayersSpeed = new ArrayList<>();
        oldPlayersSpeed.add(10);
        oldPlayersSpeed.add(13);
        oldPlayersSpeed.add(25);
        oldPlayersSpeed.add(27);

        BiConsumer<List<Integer>, List<Integer>> equality = (lista, listb) -> {
            if (lista.size() != listb.size()) {
                System.out.println("Two lists are not equals");
            } else {
                for (int i = 0; i < lista.size(); i++) {
                    if (!Objects.equals(lista.get(i), listb.get(i))) {
                        System.out.println(lista.get(i) + " is different than " + listb.get(i));
                        return;
                    }
                }
                System.out.println("Two lists are equals");
            }
        };

        equality.accept(newPlayersSpeed, oldPlayersSpeed);

        BiConsumer<List<Integer>, List<Integer>> display = (lista, listb) -> {
            lista.stream().forEach(System.out::print);
            System.out.println();
            listb.stream().forEach(System.out::print);
        };

        equality.andThen(display).accept(newPlayersSpeed, oldPlayersSpeed);

    }

}
