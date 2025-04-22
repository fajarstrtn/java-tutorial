
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

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

    }
}
