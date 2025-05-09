
public class SpaceMan {

    public static void main(String[] args) {
        var space = new Space();
        space.print("I am already in Mars.");
    }

}

class Space {

    private String message;

    public void print(String message) {
        report(this, message);
    }

    private void report(Space space, String message) {
        this.message = message;
        space.createMessage();
    }

    private void createMessage() {
        System.out.println(message);
    }

}
