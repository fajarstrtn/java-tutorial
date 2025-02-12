
public class Motorola implements CellPhone {

    @Override
    public void ring() {
        System.out.println("motorola phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("i am trying to call someone using motorola phone");
    }

    @Override
    public String greet(String name) {
        return "hello, " + name + "! i am using motorola phone now!";
    }

}
