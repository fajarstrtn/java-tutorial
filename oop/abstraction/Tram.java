
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
        System.out.println(getType() + " is running to the town.");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " stops to the next station.");
    }

    @Override
    public void dropOff(String stationName) {
        System.out.println(getType() + " is dropping off passengers at " + stationName + " station.");
    }

    @Override
    public void info() {
        System.out.println(getType() + " has " + getColor() + " color and " + getCapacity() + " capacity.");
        System.out.println(getType() + " " + (Boolean.TRUE.equals(hasFlexibleTrack()) ? "has flexible track." : "has no flexible track."));
    }

}