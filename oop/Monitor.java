
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
        System.out.println("hello, " + name + "! you just bought a " + this.model + " monitor from " + this.brand);
        System.out.println("it is " + this.inches + " inches and it cost " + this.price + " USD");
    }

}

class LEDMonitor extends Monitor {

}
