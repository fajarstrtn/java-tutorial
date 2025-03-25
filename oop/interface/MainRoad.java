
public class MainRoad {

    public static void main(String[] args) {

        var nissan = new Car();
        nissan.checkSpeedometer();
        nissan.speedUp((short) 150);
        nissan.checkSpeedometer();
        nissan.speedUp((short) 145);
        nissan.checkSpeedometer();
        nissan.speedUp((short) 100);
        nissan.checkSpeedometer();
        nissan.applyBrake((short) 50);
        nissan.checkSpeedometer();
        nissan.applyBrake((short) 265);
        nissan.checkSpeedometer();
        nissan.applyBrake((short) 100);
        nissan.checkSpeedometer();

        var kamaz = new Truck();
        kamaz.checkSpeedometer();
        kamaz.speedUp((short) 100);
        kamaz.checkSpeedometer();
        kamaz.speedUp((short) 50);
        kamaz.checkSpeedometer();
        kamaz.speedUp((short) 200);
        kamaz.checkSpeedometer();
        kamaz.applyBrake((short) 10);
        kamaz.checkSpeedometer();
        kamaz.applyBrake((short) 250);
        kamaz.checkSpeedometer();
        kamaz.applyBrake((short) 15);
        kamaz.checkSpeedometer();

    }
}

interface Vehicle {

    short START_POSITION = 0;

    void speedUp(short speed);

    void applyBrake(short speed);

    static boolean isSpeedLessThanOrEqualToZero(short speed) {
        if (speed <= 0) {
            System.out.println("Error! Speed value must be positive.");
            return true;
        }
        return false;
    }
}

class Car implements Vehicle {

    private static final short MAXIMUM_SPEED = 320;

    private short speed;

    public Car() {
        this.speed = 0;
    }

    public Car(short speed) {
        this.speed = speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getSpeed() {
        return speed;
    }

    @Override
    public void speedUp(short speed) {
        if (Vehicle.isSpeedLessThanOrEqualToZero(speed)) {
            return;
        }

        short tempSpeed = (short) (this.speed + speed);

        if (tempSpeed > MAXIMUM_SPEED) {
            System.out.println("Error! Speed exceeds maximum limit.");
            return;
        }

        this.setSpeed(tempSpeed);
    }

    @Override
    public void applyBrake(short speed) {
        if (Vehicle.isSpeedLessThanOrEqualToZero(speed)) {
            return;
        }

        short tempSpeed = (short) (this.speed - speed);

        if (tempSpeed < START_POSITION) {
            System.out.println("Error! Speed cannot be negative.");
            return;
        }

        this.setSpeed(tempSpeed);
    }

    public void checkSpeedometer() {
        System.out.println("Car Speed: " + speed);
    }
}

class Truck implements Vehicle {

    private static final short MAXIMUM_SPEED = 252;

    private short speed;

    public Truck() {
        this.speed = 0;
    }

    public Truck(short speed) {
        this.speed = speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public short getSpeed() {
        return speed;
    }

    @Override
    public void speedUp(short speed) {
        if (Vehicle.isSpeedLessThanOrEqualToZero(speed)) {
            return;
        }

        short tempSpeed = (short) (this.speed + speed);

        if (tempSpeed > MAXIMUM_SPEED) {
            System.out.println("Error! Speed exceeds truck's maximum limit.");
            return;
        }

        this.setSpeed(tempSpeed);
    }

    @Override
    public void applyBrake(short speed) {
        if (Vehicle.isSpeedLessThanOrEqualToZero(speed)) {
            return;
        }

        short tempSpeed = (short) (this.speed - speed);

        if (tempSpeed < START_POSITION) {
            System.out.println("Error! Truck speed cannot be negative.");
            return;
        }

        this.setSpeed(tempSpeed);
    }

    public void checkSpeedometer() {
        System.out.println("Truck Speed: " + speed);
    }

}
