
public class Toy {

    public static void main(String[] args) {

        Movable maverick;

        maverick = new RemoteControlCar();

        System.out.println(maverick instanceof Movable); // true
        System.out.println(maverick instanceof RemoteControlCar); // true
        System.out.println(maverick instanceof RobotCar); // false
        System.out.println(maverick instanceof ActionFigure); // false
        System.out.println(maverick instanceof Object); // true

        maverick = new RobotCar();

        System.out.println(maverick instanceof Movable); // true
        System.out.println(maverick instanceof RemoteControlCar); // true
        System.out.println(maverick instanceof RobotCar); // true
        System.out.println(maverick instanceof ActionFigure); // false

        var gundam = new ActionFigure();

        System.out.println(gundam instanceof Movable); // true
        System.out.println(gundam instanceof Audible); // true
        System.out.println(gundam instanceof Flyable); // false
        System.out.println(gundam instanceof ActionFigure); // true

    }

}

interface Movable {
}

interface Audible {
}

interface Flyable {
}

class RemoteControlCar implements Movable {
}

class RobotCar extends RemoteControlCar {
}

class ActionFigure implements Movable, Audible {
}
