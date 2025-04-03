
public class Stage {

    public static void main(String[] args) {

        var rallyCar = new Car();
        rallyCar.turnOnTheCar();
        rallyCar.moveForward();
        rallyCar.stopManually();
        rallyCar.moveBackward();
        rallyCar.stopAutomatically();
        rallyCar.turnOffTheCar();

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
