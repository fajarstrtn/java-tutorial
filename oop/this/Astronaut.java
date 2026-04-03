
class Satellite {

    private String message;

    public void print(String message) {
        report(this, message);
    }

    private void report(Satellite satellite, String message) {
        this.message = message;
        satellite.create();
    }

    private void create() {
        System.out.println(message);
    }

}

public class Astronaut {

    public static void main(String[] args) {
        var satellite = new Satellite();
        satellite.print("Touchdown");
    }

}
