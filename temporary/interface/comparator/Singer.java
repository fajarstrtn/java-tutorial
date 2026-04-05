
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class Singer {

    private int age;
    private String name;
    private double paidPerConcert;

    public Singer() {
    }

    public Singer(int age, String name, double paidPerConcert) {
        this.age = age;
        this.name = name;
        this.paidPerConcert = paidPerConcert;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPaidPerConcert() {
        return paidPerConcert;
    }

    public void setPaidPerConcert(double paidPerConcert) {
        this.paidPerConcert = paidPerConcert;
    }

    @Override
    public String toString() {
        return "(" + name + "-" + age + "-" + paidPerConcert + ")";
    }

    public static void main(String[] args) {
        List<Singer> singers = Arrays.asList(
                new Singer(17, "Valeria Gordon", 1200.46),
                new Singer(25, "Jeanie Morgan", 1500.46),
                new Singer(19, "Mark Johnson", 980.75),
                new Singer(20, "Amelia Heck", 1020.87),
                new Singer(20, "Margaret Winters", 1150.50)
        );

        singers.sort(Comparator.comparing(Singer::getName));

        singers.forEach(System.out::println);
    }
}
