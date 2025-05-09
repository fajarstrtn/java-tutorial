
public class InferredDataTypes {

    public static void main(String[] args) {
        var name = "John Doe";
        var age = 21;
        var address = "Boulevard Street 101th";

        // Variable value should be initialized right away
        // because the data type is determined at compile-time.
        // 
        // var hobby; will cause an error.
        System.out.println("Hi, my name is " + name + ".");
        System.out.println("I am " + age + " years-old.");
        System.out.println("I lived in " + address + ".");
    }

}
