
public class Garage {

    public static void main(String[] args) {

        Car.Move car1 = new SportCar();
        car1.drive();

        Car.Break car2 = new SportCar();
        car2.stop();

    }

}

class Car {

    public interface Move {

        public void drive();

    }

    protected interface Break {

        public void stop();

    }

}

class SportCar implements Car.Move, Car.Break {

    @Override
    public void drive() {
        System.out.println("Driver drives the sport car.");
    }

    @Override
    public void stop() {
        System.out.println("Driver stops the sport car.");
    }

}
