
public class InferredDataTypes {

    public static void main(String[] args) {

        var name = "john doe";
        var age = 21;
        var address = "boulevard street no.101";

        /* Variable value should be initialized right away
        because the data type is determined at compile-time.
        
        var hobby; will cause an error. */
        System.out.println("hi my name is " + name);
        System.out.println("i am " + age + " years-old");
        System.out.println("i lived in " + address);

    }
}
