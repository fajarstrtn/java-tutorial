
import java.util.List;
import java.util.ArrayList;

public class Bus {

    public static void main(String[] args) {
        var counter = 1;

        List<String> buses = new ArrayList<>();
        buses.add("Mercedes-Benz Citaro");
        buses.add("Volvo 7900 Electric Hybrid");
        buses.add("BYD K9");
        buses.add("MAN A22");
        buses.add("Scania Citywide");
        buses.add("Alexander Dennis Enviro200");
        buses.forEach(Bus::onboard);

        separate(counter++, buses);

        // Set BYD K9 at index 2 to become Mercedes-Benz Conecto.
        buses.set(2, "Mercedes-Benz Conecto");
        buses.stream().filter(Bus::isEqualsIgnoreCase).forEach(Bus::onboard);

        separate(counter++, buses);

        // Add new element at the end of the list.
        buses.add("Neoplan Skyliner");

        separate(counter++, buses);

        //  Get index 1 of the list.
        System.out.println("Index 1 of the list is \"" + buses.get(1) + "\".");

        separate(counter++, buses);

        // Remove element at index 2.
        System.out.println("Removing element at index 2 is \"" + buses.remove(2) + "\".");

        separate(counter++, buses);

        // Remove element bt its object.
        System.out.println("Removing \"Scania Citywide\" is " + buses.remove("Scania Citywide") + ".");

        separate(counter++, buses);
    }

    private static boolean isEqualsIgnoreCase(String bus) {
        return bus.equalsIgnoreCase("mercedes-benz conecto");
    }

    private static void onboard(String bus) {
        System.out.println(bus + " is on the way.");
    }

    private static void separate(int counter, List<String> buses) {
        System.out.println("No. " + counter + " changes: " + buses);
        System.out.println();
    }

}
