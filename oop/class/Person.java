
public class Person {

    public static final String COUNTRY = "Netherlands";

    public String name;
    public String address;
    public int age;
    public String occupation;
    public double salaryPerMonth;
    public boolean hasMarried;

    public static void main(String[] args) {
        Person person = new Person();

        person.name = "John Doe";
        person.address = "Apt 900, 7321 Vondelpark, Amersfoort, Gelderland, 5260 SB, Netherlands, +31-5-5080-5709";
        person.age = 25;
        person.occupation = "Back-End Developer";
        person.hasMarried = false;

        System.out.println(person.name);                              // Output: John Doe
        System.out.println(person.address);                           // Output: Apt 900, 7321 Vondelpark, Amersfoort, Gelderland, 5260 SB, Netherlands, +31-5-5080-5709
        System.out.println(person.age);                               // Output: 25
        System.out.println(person.occupation);                        // Output: Netherlands
        System.out.println(COUNTRY);                                  // Output: He is still single
        System.out.println(person.hasMarried
                ? "He is married to someone" : "He is still single"); // Output: 
    }

}
