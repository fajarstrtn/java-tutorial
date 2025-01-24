
public class TaxiCar {

    private static final String DELIMETER = " ::: ";

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

    public Boolean getIsOperated() {

        return isOperated;

    }

    public void setIsOperated(Boolean isOperated) {

        this.isOperated = isOperated;

    }

    public Integer getIssuedIn() {

        return issuedIn;

    }

    public void setIssuedIn(Integer issuedIn) {

        this.issuedIn = issuedIn;

    }

    public void print() {

        System.out.println(this.name + DELIMETER
                + this.type + DELIMETER
                + this.isOperated + DELIMETER
                + this.issuedIn);

    }

    public Boolean isCarOutdated() {

        this.print();
        return this.issuedIn < 2022;

    }

    public static void main(String[] args) {

        var grabcar = new TaxiCar();

        grabcar.setName("grab car");
        grabcar.setType("city car");
        grabcar.setIsOperated(true);
        grabcar.setIssuedIn(2019);

        System.out.println("is " + grabcar.getName() + " is outdated? " + grabcar.isCarOutdated());

    }

}
