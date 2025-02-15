
public class Person {

    public static final String COUNTRY = "netherlands";
    public String name;
    public String address;
    public Integer age;
    public String occupation;
    public Double salaryPerMonth;
    public Boolean isMarried;

    public static void main(String[] args) {

        var kelly = new Person();
        kelly.name = "kelly mariana";
        kelly.address = "99 Amsterdam Blvd";
        kelly.age = 24;
        kelly.occupation = "tax auditor";
        kelly.isMarried = false;

        System.out.println(kelly.name);
        System.out.println(kelly.address);
        System.out.println(kelly.age);
        System.out.println(kelly.occupation);
        System.out.println(COUNTRY);
        System.out.println(Boolean.TRUE.equals(kelly.isMarried)? "she is married to someone" : "she is still single");

    }

}
