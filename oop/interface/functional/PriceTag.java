
import java.nio.channels.Pipe;
import java.util.function.Function;
import java.util.List;

public class PriceTag {

    public static void main(String[] args) {

        // Function<ParamType, ReturnType> perform operation for dividing a single value to be half.
        Function<Integer, Double> half = price -> price / 2.0;
        System.out.println(half.apply(10));

        Function<String, Integer> length = brand -> brand.length();
        System.out.println(length.apply("Uniqlo"));

        Double price = 10_000D;
        Function<Double, Double> cashback = p -> p * (20 / 100.0);
        Function<Double, Double> realPrice = p -> p - cashback.apply(price);
        System.out.println(realPrice.apply(price));

        try {
            half.andThen(null).apply(100);
        } catch (NullPointerException npe) {
            System.out.println("Catch null value with andThen method");
        }

        Function<Integer, Double> calculate = p -> p - (50 / 100.0);
        calculate = calculate.compose(p -> p * 5);
        System.out.println(calculate.apply(10));

        try {
            calculate = calculate.compose(null);
            System.out.println(calculate.apply(5));
        } catch (NullPointerException npe) {
            System.out.println("Catch null value with compose method");
        }

        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(100));

        List<Employee> employees = List.of(
                new Employee("James Dean", "Cashier", 5_000D),
                new Employee("Jake Blake", "Sales", 6_000D),
                new Employee("Livy Zheng", "Senior Sales", 6_500D),
                new Employee("Lou Harbour", "Manager", 10_200D),
                new Employee("Sidney Simpson", "Senior Manager", 25_000D)
        );
        Function<Employee, String> findEmployee = employee -> employee.getName();
        employees.stream().map(findEmployee).forEach(System.out::println);

        Function<Integer, Integer> multiply = p -> p * 4;
        Function<Integer, Double> divide = p -> p / 2.0;
        Function<Integer, Double> count = multiply.andThen(divide);
        System.out.println(count.apply(10));

    }

}

class Employee {

    private String name;
    private String position;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, String position, Double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
