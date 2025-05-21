
public class Monitor {

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

    public void greetCustomer(String name) {
        System.out.println("Hi, " + name + "! You just bought a " + model + " monitor from " + brand + ".");
        System.out.println("It is " + inches + " inches and it cost " + price + " USD.");
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
    public void greetCustomer(String name) {
        System.out.println("Hi, " + name + "! You just bought a " + getModel() + " led monitor from " + getBrand() + ".");
        System.out.println("It is " + getInches() + " inches and it cost " + getPrice() + " USD. " + (Boolean.TRUE.equals(isLED) ? "it is an led monitor." : "it is not an led monitor."));
    }

}