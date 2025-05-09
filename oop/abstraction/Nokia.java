
public class Nokia implements CellPhone {

    @Override
    public void ring() {
        System.out.println("Nokia phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("I am trying to call someone using Nokia phone.");
    }

    @Override
    public String greet(String name) {
        return "Hello, " + name + "! I am using Nokia phone now!";
    }

}
