
public class Monorail extends Train {

    public Monorail() {
        super();
    }

    public Monorail(String type, String color, Integer capacity) {
        super(type, color, capacity);
    }

    @Override
    public void run() {
        System.out.println(this.getType() + " is running fast to the town");
    }

    @Override
    public void stop() {
        System.out.println(this.getType() + " stops exactly to the next station");
    }

    @Override
    public void dropOff(String stationName) {
        System.out.println(this.getType() + " is shortly dropping off passengers at " + stationName + " station");
    }

    @Override
    public void info() {
        System.out.println(this.getType() + " has " + this.getColor() + " color and " + this.getCapacity() + " capacity.");
    }

}
