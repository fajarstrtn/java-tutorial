
public class Tram extends Train {

    private Boolean flexibleTrack;

    public Tram() {
        super();
    }

    public Tram(String type, String color, Integer capacity, Boolean flexibleTrack) {
        super(type, color, capacity);
        this.flexibleTrack = flexibleTrack;
    }

    public Boolean hasFlexibleTrack() {
        return flexibleTrack;
    }

    public void hasFlexibleTrack(Boolean flexibleTrack) {
        this.flexibleTrack = flexibleTrack;
    }

    @Override
    public void run() {
        System.out.println(this.getType() + " is running to the town");
    }

    @Override
    public void stop() {
        System.out.println(this.getType() + " stops to the next station");
    }

    @Override
    public void dropOff(String stationName) {
        System.out.println(this.getType() + " is dropping off passengers at " + stationName + " station");
    }

    @Override
    public void info() {
        System.out.println(this.getType() + " has " + this.getColor() + " color and " + this.getCapacity() + " capacity.");
        System.out.println(this.getType() + " " + (Boolean.TRUE.equals(this.hasFlexibleTrack())? "has flexible track" : "has no flexible track"));
    }

}
