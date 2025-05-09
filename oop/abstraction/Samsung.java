
public class Samsung implements CellPhone {

    @Override
    public void ring() {
        System.out.println("Samsung phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("I am trying to call someone using Samsung phone.");
    }

    @Override
    public String greet(String name) {
        return "Hi, " + name + "! I am using samsung phone now!";
    }

}
