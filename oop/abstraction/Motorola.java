
public class Motorola implements CellPhone {

    @Override
    public void ring() {
        System.out.println("Motorola phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("I am trying to call someone using Motorola phone.");
    }

    @Override
    public String greet(String name) {
        return "Hello, " + name + "! I am using Motorola phone now!";
    }

}
