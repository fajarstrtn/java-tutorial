
public class Person {

    String name;

    String address;

    Integer age;

    String occupation;

    Boolean isMarried;

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
        System.out.println(kelly.isMarried ? "she has married to someone" : "she's still single");

    }

}
