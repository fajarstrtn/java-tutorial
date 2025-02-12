
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

/*  abstract method is a method which should be overrided in subclasses.
    abstract class should have at least one abstract method. */
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

/*  abstract class can also have concrete method (has body and declared withoud abstract). */
    public void dropOff(String stationName) {
        System.out.println(this.type + " is dropping off passengers at " + stationName + " station");
    }

    public void info() {
        System.out.println(this.type + " has " + this.color + " color and " + this.capacity + " capacity");
    }

/*  static method can only access static attributes and methods.
    static attribute or method belongs to the class, not instance. */
    public static void wheelTrainTotal(String trainType) {
        System.out.println(trainType + " has " + WHEEL + " wheels");
    }

/*  final method cannot be overrided. */
    public final void maintain() {
        System.out.println(this.type + " is under maintainance");
    }

}
