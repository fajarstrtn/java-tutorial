
class Keyboard {

    private String brand;
    private String model;

    public Keyboard() {
    }

    public Keyboard(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void typeSomething(String text) {
        System.out.println(text);
    }

    public void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

}

class MechanicalKeyboard extends Keyboard {

    private String switchType;

    public MechanicalKeyboard() {
        super();
    }

    public MechanicalKeyboard(String switchType) {
        this.switchType = switchType;
    }

    public MechanicalKeyboard(String switchType, String brand, String model) {
        super(brand, model);
        this.switchType = switchType;
    }

    public String getSwitchType() {
        return switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    @Override
    public void typeSomething(String text) {
        System.out.println(text);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Switch Type: " + switchType);
    }

}

class RegularKeyboard extends Keyboard {

    private Boolean hasNumericPad;

    public RegularKeyboard() {
        super();
    }

    public RegularKeyboard(Boolean hasNumericPad) {
        this.hasNumericPad = hasNumericPad;
    }

    public RegularKeyboard(Boolean hasNumericPad, String brand, String model) {
        super(brand, model);
        this.hasNumericPad = hasNumericPad;
    }

    public Boolean hasNumericPad() {
        return hasNumericPad;
    }

    public void hasNumericPad(Boolean hasNumericPad) {
        this.hasNumericPad = hasNumericPad;
    }

    @Override
    public void typeSomething(String text) {
        System.out.println(text);
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Numeric Pad: " + hasNumericPad);
    }

}

class Monitor {

    private String brand;
    private String model;
    private Double inches;
    private Double price;

    public Monitor() {
    }

    public Monitor(String brand, Double inches, String model, Double price) {
        this.brand = brand;
        this.inches = inches;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getInches() {
        return inches;
    }

    public void setInches(Double inches) {
        this.inches = inches;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void getInfo(String name) {
        System.out.println("Hi, " + name + "! You just bought a " + model + " monitor from " + brand);
        System.out.println("It\'s " + inches + " inches");
        System.out.println("It cost " + price + " USD");
    }

}

class LEDMonitor extends Monitor {

    private Boolean isLED;

    public LEDMonitor() {
        super();
    }

    public LEDMonitor(String brand, Double inches, String model, Double price, Boolean isLED) {
        super(brand, inches, model, price);
        this.isLED = isLED;
    }

    public Boolean isLED() {
        return isLED;
    }

    public void isLED(Boolean isLED) {
        this.isLED = isLED;
    }

    @Override
    public void getInfo(String name) {
        System.out.println("Hi, " + name + "! You just bought a " + getModel() + " led monitor from " + getBrand());
        System.out.println("It\'s " + getInches() + " inches");
        System.out.println("It cost " + getPrice() + " USD");
        System.out.println((Boolean.TRUE.equals(isLED) ? "It\'s a LED monitor" : "It\'s not a LED monitor"));
    }

}

class Earphone {

    private String brand;
    private String model;
    private Double price;
    private String color;
    private Boolean isWired;
    private String ipxRating;

    public Earphone(String brand, String color, String ipxRating, Boolean isWired, String model, Double price) {
        this.brand = brand;
        this.color = color;
        this.ipxRating = ipxRating;
        this.isWired = isWired;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isWired() {
        return isWired;
    }

    public void isWired(Boolean isWired) {
        this.isWired = isWired;
    }

    public String getIpxRating() {
        return ipxRating;
    }

    public void setIpxRating(String ipxRating) {
        this.ipxRating = ipxRating;
    }

    public String getInfo() {
        return String.format("""
        {
            "brand" : "%s",
            "color" : "%s",
            "ipxRating" : "%s",
            "isWired" : %b,
            "model" : "%s",
            "price" : %.2f
        }""", brand, color, ipxRating, isWired, model, price);
    }

}

class Earbuds extends Earphone {

    private Boolean isNoiseCancelling;

    // Child class should declare a constructor if parent class doesn't.
    public Earbuds(String brand, String color, String ipxRating, Boolean isWired, String model, Double price, Boolean isNoiseCancelling) {
        super(brand, color, ipxRating, isWired, model, price);
        this.isNoiseCancelling = isNoiseCancelling;
    }

    public Boolean isNoiseCancelling() {
        return isNoiseCancelling;
    }

    public void isNoiseCancelling(Boolean isNoiseCancelling) {
        this.isNoiseCancelling = isNoiseCancelling;
    }

    @Override
    public String getInfo() {
        return String.format("""
        {
            "brand" : "%s",
            "color" : "%s",
            "ipxRating" : "%s",
            "isWired" : %b,
            "model" : "%s",
            "price" : %.2f,
            "isNoiseCancelling" : %b
        }""", getBrand(), getColor(), getIpxRating(), isWired(), getModel(), getPrice(), isNoiseCancelling);
    }

}

public class Peripheral {

    private static final String TEXT = "Lorem ipsum dolor sit amet";

    public static void main(String[] args) {
        var keyboard = new Keyboard();
        keyboard.setBrand("Logitech");
        keyboard.setModel("Wired Keyboard");
        keyboard.typeSomething(TEXT);
        keyboard.getInfo();

        var mechanical = new MechanicalKeyboard();
        mechanical.setBrand("Razer");
        mechanical.setModel("Mechanical Keyboard");
        mechanical.setSwitchType("Cherry MX Red");
        keyboard.typeSomething(TEXT);
        keyboard.getInfo();

        var regular = new RegularKeyboard();
        regular.setBrand("Dell");
        regular.setModel("Regular Keyboard");
        regular.hasNumericPad(true);
        keyboard.typeSomething(TEXT);
        keyboard.getInfo();

        var monitor = new Monitor();
        monitor.setBrand("LG");
        monitor.setModel("24MR400-B");
        monitor.setInches(23.8);
        monitor.setPrice(79.52);
        monitor.getInfo("John Doe");

        var ledMonitor = new LEDMonitor();
        ledMonitor.setBrand("Samsung");
        ledMonitor.setModel("T35F");
        ledMonitor.setInches(24D);
        ledMonitor.setPrice(99.99);
        ledMonitor.getInfo("Jane Doe");

        var jbl = new Earphone("JBL Tune Flex", "Blue", "4", false, "Tune Flex", 3_200_000D);
        System.out.println(jbl.getInfo());

        var samsung = new Earbuds("Samsung Earbuds Pro 4", "Black", "4", false, "Earbuds Pro 4", 5_000_000D, true);
        System.out.println(samsung.getInfo());
    }

}
