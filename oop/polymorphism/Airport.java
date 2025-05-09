
public class Airport {

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.takeOff();
        plane.land();
        plane.land("Changi Airport");

        Cargo cargo = new Cargo();
        cargo.takeOff();
        cargo.land();

        Bomber bomber = new Bomber();
        bomber.takeOff();
        bomber.land();
    }

}
