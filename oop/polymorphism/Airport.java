
class Plane {

    public void takeOff() {
        System.out.println("Plane is taking off");
    }

    public void land(String airportName) {
        System.out.println("Plane is about to land on " + airportName);
    }

    public void fueling() {
        System.out.println("Plane is fueling");
    }

}

class Cargo extends Plane {

    @Override
    public void takeOff() {
        System.out.println("Cargo Plane is taking off");
    }

    @Override
    public void land(String airportName) {
        System.out.println("Cargo Plane is about to land on " + airportName);
        System.out.println("Cargo Plane just safely landed");
    }

    @Override
    public void fueling() {
        System.out.println("Cargo Plane is fueling");
    }

    public void load() {
        System.out.println("Cargo Plane is loading stuff");
    }

}

class Bomber extends Plane {

    @Override
    public void takeOff() {
        System.out.println("The bomber plane is taking off");
    }

    @Override
    public void land(String airportName) {
        System.out.println("Bomber Plane is about to land on " + airportName);
        System.out.println("Bomber Plane just safely landed");
    }

    @Override
    public void fueling() {
        System.out.println("Bomber Plane is fueling");
    }

    public void scan() {
        System.out.println("Bomber Plane is scanning threats");
    }

}

public class Airport {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fueling();
        plane.takeOff();
        plane.land("Singapore Changi Airport");

        Plane cargo = new Cargo();
        cargo.fueling();
        ((Cargo) cargo).load();
        cargo.takeOff();
        cargo.land("Dubai International Airport");

        Plane bomber = new Bomber();
        bomber.fueling();
        bomber.takeOff();
        ((Bomber) bomber).scan();
        bomber.land("London Heathrow Airport");
    }

}
