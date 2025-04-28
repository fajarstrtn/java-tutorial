
public class Garage {

    public static void main(String[] args) {

        Car.Engine car1 = new SportCar();
        car1.start();
        car1.drive();

        Car.Brake car2 = (Car.Brake) car1;
        car2.stop();

        Mode.Safe car3 = (Mode.Safe) car2;
        car3.changeToNormal();
        car3.changeToEco();
        car3.changeToComfort();

        Mode.Speed car4 = (Mode.Speed) car3;
        car4.changeToSport();
        car4.changeToDrift();

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

    public interface Engine {

        public void start();

        public void drive();

    }

    protected interface Brake {

        public void stop();

    }

}

class SportCar implements Car.Engine, Car.Brake, Mode.Safe, Mode.Speed {

    @Override
    public void start() {
        System.out.println("Driver starts the sport car.");
    }

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

    @Override
    public void changeToSport() {
        System.out.println("Driver is changing his driving style to sport mode.");
    }

    @Override
    public void changeToDrift() {
        System.out.println("Driver is changing his driving style to drift mode.");
    }

}
