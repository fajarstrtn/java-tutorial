
public class Cargo extends Plane {

    @Override
    public void takeOff() {
        System.out.println("The cargo plane is taking off.");
    }

    @Override
    public void land() {
        System.out.println("The cargo plane is about to land.");
    }

}
