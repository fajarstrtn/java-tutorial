
public class Person {

    public static final String COUNTRY = "Netherlands";

    public String name;
    public String address;
    public Integer age;
    public String occupation;
    public Double salaryPerMonth;
    public Boolean isMarried;

    public static void main(String[] args) {

        var phill = new Person();
        phill.name = "Phill James";
        phill.address = "99 Amsterdam Blvd";
        phill.age = 24;
        phill.occupation = "Tax Uuditor";
        phill.isMarried = false;

        System.out.println(phill.name);
        System.out.println(phill.address);
        System.out.println(phill.age);
        System.out.println(phill.occupation);
        System.out.println(COUNTRY);
        System.out.println(Boolean.TRUE.equals(phill.isMarried) ? "He is married to someone" : "He is still single");

    }

}
