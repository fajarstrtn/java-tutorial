
public class Stage {

    public static void main(String[] args) {
        var rallyCar = new Car();
        rallyCar.turnOnTheCar();
        rallyCar.moveForward();
        rallyCar.stopManually();
        rallyCar.moveBackward();
        rallyCar.stopAutomatically();
        rallyCar.turnOffTheCar();

        var superCar = new SuperCar();
        superCar.turnOnTheCar();
        superCar.moveForward();
        superCar.stopManually();
        superCar.moveBackward();
        superCar.stopAutomatically();
        superCar.drift();
        superCar.turnOffTheCar();
    }

}

interface Power {

    void turnOnTheCar();

    void turnOffTheCar();

}

interface MoveActivity extends Power {

    void moveForward();

    void moveBackward();

}

interface StopActivity extends Power {

    void stopManually();

    void stopAutomatically();

}

// Interface is able to extend multiple interfaces.
interface Slalom extends MoveActivity, StopActivity {

    void drift();

}

class Car implements MoveActivity, StopActivity {

    @Override
    public void turnOnTheCar() {
        System.out.println("Driver is turning on the car.");
    }

    @Override
    public void turnOffTheCar() {
        System.out.println("Driver is turning off the car.");
    }

    @Override
    public void moveForward() {
        System.out.println("The car is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("The car is moving backward.");
    }

    @Override
    public void stopManually() {
        System.out.println("The car stops manually.");
    }

    @Override
    public void stopAutomatically() {
        System.out.println("The car stops automatically.");
    }

}

class SuperCar implements Slalom {

    @Override
    public void drift() {
        System.out.println("The super car is drifting.");
    }

    @Override
    public void turnOnTheCar() {
        System.out.println("Driver is turning on the super car.");
    }

    @Override
    public void turnOffTheCar() {
        System.out.println("Driver is turning off the super car.");
    }

    @Override
    public void moveForward() {
        System.out.println("The super car is moving forward.");
    }

    @Override
    public void moveBackward() {
        System.out.println("The super car is moving backward.");
    }

    @Override
    public void stopManually() {
        System.out.println("The super car stops manually.");
    }

    @Override
    public void stopAutomatically() {
        System.out.println("The super car stops automatically.");
    }

}
