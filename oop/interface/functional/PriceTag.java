
import java.nio.channels.Pipe;
import java.util.function.Function;

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

        Function<Integer, Integer> value = Function.identity();
        System.out.println(value.apply(100));

    }

}
