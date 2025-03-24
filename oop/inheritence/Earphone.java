
public class Earphone {

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

    public Boolean getIsWired() {
        return isWired;
    }

    public void setIsWired(Boolean isWired) {
        this.isWired = isWired;
    }

    public String getIpxRating() {
        return ipxRating;
    }

    public void setIpxRating(String ipxRating) {
        this.ipxRating = ipxRating;
    }

    public String getInformation() {
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

    private Boolean isNoiceCancelling;

    /* Child class should declare a constructor if parent class doesn't. */
    public Earbuds(String brand, String color, String ipxRating, Boolean isWired, String model, Double price, Boolean isNoiceCancelling) {
        super(brand, color, ipxRating, isWired, model, price);
        this.isNoiceCancelling = isNoiceCancelling;
    }

    public Boolean getIsNoiceCancelling() {
        return isNoiceCancelling;
    }

    public void setIsNoiceCancelling(Boolean isNoiceCancelling) {
        this.isNoiceCancelling = isNoiceCancelling;
    }

    @Override
    public String getInformation() {
        return String.format("""
        {
            "brand" : "%s",
            "color" : "%s",
            "ipxRating" : "%s",
            "isWired" : %b,
            "model" : "%s",
            "price" : %.2f,
            "isNoiceCancelling" : %b
        }""", getBrand(), getColor(), getIpxRating(), getIsWired(), getModel(), getPrice(), isNoiceCancelling);
    }

}
