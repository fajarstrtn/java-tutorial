
public class Taxi {

    private String name;
    private String type;
    private Integer issuedIn;
    private Boolean isOperated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIssuedIn() {
        return issuedIn;
    }

    public void setIssuedIn(Integer issuedIn) {
        this.issuedIn = issuedIn;
    }

    public Boolean isOperated() {
        return isOperated;
    }

    public void isOperated(Boolean isOperated) {
        this.isOperated = isOperated;
    }

    public Boolean isOutdated() {
        return issuedIn < 2022;
    }

    public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.setName("Uber");
        taxi.setType("Premium Taxi Service");
        taxi.isOperated(true);
        taxi.setIssuedIn(2019);

        System.out.println(taxi.getName());     // Output: Uber
        System.out.println(taxi.getType());     // Output: Premium Taxi Service
        System.out.println(taxi.isOperated());  // Output: true
        System.out.println(taxi.getIssuedIn()); // Output: 2019
        System.out.println(taxi.isOutdated());  // Output: true
    }

}
