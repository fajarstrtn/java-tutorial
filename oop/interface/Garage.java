
public class Garage {

    public static void main(String[] args) {

        Car.Move car1 = new SportCar();
        car1.drive();

        Car.Break car2 = new SportCar();
        car2.stop();

        Mode.Safe car3 = new SportCar();
        car3.changeToNormal();

    }

}

interface Mode {

    interface Safe {

        public void changeToNormal();

        public void changeToEco();

        public void changeToComfort();

    }

    interface Speed {

        public void changeToSport();

        public void changeToDrift();

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

class SportCar implements Car.Move, Car.Break, Mode.Safe {

    @Override
    public void drive() {
        System.out.println("Driver drives the sport car.");
    }

    @Override
    public void stop() {
        System.out.println("Driver stops the sport car.");
    }

    @Override
    public void changeToNormal() {
        System.out.println("Driver is changing his driving style to normal mode.");
    }

    @Override
    public void changeToEco() {
        System.out.println("Driver is changing his driving style to eco mode.");
    }

    @Override
    public void changeToComfort() {
        System.out.println("Driver is changing his driving style to comfort mode.");
    }

}
