
public class Samsung implements CellPhone {

    @Override
    public void ring() {
        System.out.println("samsung phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("i am trying to call someone using samsung phone");
    }

    @Override
    public String greet(String name) {
        return "hello, " + name + "! i am using samsung phone now!";
    }

}
