
public abstract class Train {

    private String type;
    private String color;
    private Integer capacity;
    private static final Integer WHEEL = 8;

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

    public static Integer getWHEEL() {
        return WHEEL;
    }

    // An abstract class can also have concrete method.
    public void dropOff(String stationName) {
        System.out.println(type + " is dropping off passengers at " + stationName + " station.");
    }

    public void info() {
        System.out.println(type + " has " + color + " color and " + capacity + " capacity.");
    }

    // Static method can only access static attributes and methods, because static attributes or methods belong to the class, not instance.
    public static void wheelTrainTotal(String trainType) {
        System.out.println(trainType + " has " + WHEEL + " wheels.");
    }

    // A final method cannot be overrided.
    public final void maintain() {
        System.out.println(type + " is under maintainance.");
    }

}
