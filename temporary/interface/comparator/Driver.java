
import java.util.Comparator;
// import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Driver {

    private String name;
    private Integer number;
    private String team;

    public Driver() {
    }

    public Driver(String name, Integer number, String team) {
        this.name = name;
        this.number = number;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return name + ", " + number + ", " + team;
    }

    public static void main(String[] args) {
        // List all drivers.
        List<Driver> drivers = Arrays.asList(
                new Driver("Oscar Piastri", 81, "McLaren"),
                new Driver("Lando Norris", 4, "McLaren"),
                new Driver("Max Verstappen", 1, "Red Bull Racing"),
                new Driver("George Russel", 63, "Mercedes"),
                new Driver("Charles Leclerc", 81, "Ferrari")
        );

        // These are variations of using Comparator Interface.
        // 1. Call immediate object of Comparator inside of sort method. In this method, you can sort driver by its name and number.
        // Collections.sort(drivers, new Comparator<Driver>() {
        //     @Override
        //     public int compare(Driver d1, Driver d2) {
        //         int nameCompare = d1.getName().compareToIgnoreCase(d2.getName());
        //         if (nameCompare != 0) {
        //             return nameCompare;
        //         }
        //         return Integer.compare(d1.getNumber(), d2.getNumber());
        //     }
        // });
        // 
        // In this scenario, you sort driver by its name.
        // Collections.sort(drivers, new Comparator<Driver>() {
        //     @Override
        //     public int compare(Driver d1, Driver d2) {
        //         return d1.getName().compareTo(d2.getName());
        //     }
        // });
        // 
        // 2. Sort using lambda or method reference.
        drivers.sort(Comparator.comparingInt(Driver::getNumber).reversed());

        // Print all drivers.
        drivers.forEach(System.out::println);
    }

}
