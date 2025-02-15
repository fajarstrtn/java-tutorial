
public class Monorail extends Train {

    public Monorail() {
        super();
    }

    public Monorail(String type, String color, Integer capacity) {
        super(type, color, capacity);
    }

    @Override
    public void run() {
        System.out.println(getType() + " is running fast to the town");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " stops exactly to the next station");
    }

    @Override
    public void dropOff(String stationName) {
        System.out.println(getType() + " is shortly dropping off passengers at " + stationName + " station");
    }

    @Override
    public void info() {
        System.out.println(getType() + " has " + getColor() + " color and " + getCapacity() + " capacity.");
    }

}
