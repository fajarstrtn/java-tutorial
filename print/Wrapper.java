
import java.util.ArrayList;

public class Wrapper {

    public static void main(String[] args) {

        char ch1 = 'a';
        Character ch2 = ch1;
        System.out.println(ch2);

        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(20);
        System.out.println(ls.get(0));

        Long l1 = 10000000L;
        long l2 = l1;
        System.out.println(l2);

        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(50);
        int int1 = ls2.get(0);
        System.out.println(int1);

/*      Since user is working with objects now, user can use certain methods
        to get information about the specific object.
        For example, the following methods are used to get the value associated
        with the corresponding wrapper object:
        
        1. intValue()
        2. byteValue()
        3. shortValue()
        4. longValue()
        5. floatValue()
        6. doubleValue()
        7. charValue()
        8. booleanValue() */
        Long balance = 100000000000L;
        System.out.println(balance.longValue());

        String age = "26";
        int realAge = Integer.parseInt(age);
        System.out.println(realAge);
        
    }
}
