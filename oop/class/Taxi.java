
public class Taxi {

    private String name;
    private String type;
    private Boolean isOperated;
    private Integer issuedIn;

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

    public Boolean isOperated() {
        return isOperated;
    }

    public void isOperated(Boolean isOperated) {
        this.isOperated = isOperated;
    }

    public Integer getIssuedIn() {
        return issuedIn;
    }

    public void setIssuedIn(Integer issuedIn) {
        this.issuedIn = issuedIn;
    }

    public Boolean isCarOutdated() {
        return issuedIn < 2022;
    }

    public static void main(String[] args) {
        var taxi = new Taxi();
        taxi.setName("Conventional Taxi");
        taxi.setType("City Car");
        taxi.isOperated(true);
        taxi.setIssuedIn(2019);

        System.out.println("Is " + taxi.getName() + " is outdated? " + taxi.isCarOutdated() + ".");
    }

}
