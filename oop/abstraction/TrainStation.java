
abstract class Train {

    private static final Integer WHEEL = 8;

    private String type;
    private String color;
    private Integer capacity;

    public Train() {
    }

    public Train(String type, String color, Integer capacity) {
        this.type = type;
        this.color = color;
        this.capacity = capacity;
    }

    public abstract void run();

    public abstract void stop();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public static Integer getWheel() {
        return WHEEL;
    }

    // An abstract class can also have concrete method.
    public void dropOff(String stationName) {
        System.out.println(type + " is dropping off passengers at " + stationName + " station");
    }

    public void info() {
        System.out.println(type + " has " + color + " color and " + capacity + " capacity");
    }

    // Static method can only access static attributes and methods, because static attributes or methods belong to the class, not instance.
    public static void wheelTrainTotal(String trainType) {
        System.out.println(trainType + " has " + WHEEL + " wheels");
    }

    // A final method cannot be overrided.
    public final void maintain() {
        System.out.println(type + " is under maintainance");
    }

}

class Monorail extends Train {

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
        System.out.println(getType() + " has " + getColor() + " color and " + getCapacity() + " capacity");
    }

}

class Tram extends Train {

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
        System.out.println(getType() + " is running to the town");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " stops to the next station");
    }

    @Override
    public void dropOff(String stationName) {
        System.out.println(getType() + " is dropping off passengers at " + stationName + " station");
    }

    @Override
    public void info() {
        System.out.println(getType() + " has " + getColor() + " color and " + getCapacity() + " capacity");
        System.out.println(getType() + " " + (Boolean.TRUE.equals(hasFlexibleTrack()) ? "has flexible track" : "has no flexible track"));
    }

}

public class TrainStation {

    public static void main(String[] args) {
        Train monorail = new Monorail();
        monorail.setType("Straddle Monorail");
        monorail.setColor("White-Blue");
        monorail.setCapacity(300);
        monorail.run();
        monorail.stop();
        monorail.dropOff("Resorts World Station");
        monorail.info();
        monorail.maintain();

        Train.wheelTrainTotal(monorail.getType());

        Train tram = new Tram();
        tram.setType("Low-floor Tram");
        tram.setColor("Red-Black");
        tram.setCapacity(250);

        if (tram instanceof Tram tmp) {
            tmp.hasFlexibleTrack(true);
        }

        tram.run();
        tram.stop();
        tram.dropOff("Old Steine Shelter");
        tram.info();
        tram.maintain();
        Train.wheelTrainTotal(tram.getType());
    }

}
