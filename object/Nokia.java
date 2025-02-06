
public class Nokia implements CellPhone {

    @Override
    public void ring() {
        System.out.println("nokia phone is ringing...");
    }

    @Override
    public void call() {
        System.out.println("i am trying to call someone using nokia phone");
    }

    @Override
    public String greet(String name) {
        return "hello, " + name + "! i am using nokia phone now!";
    }

}
