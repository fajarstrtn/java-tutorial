
public class DefaultHandler {

    // You can also define the exception handler type in 'main' method signature, but this is practically bad for production-ready application.
    public static void main(String[] args) {
        // If you don\'t specify the suitable exception, Java will throw the exception to the default exception handler.
        String value = null;

        System.out.println(value.length());

        // Once exception happens and cannot get caught by catch block, the rest of the program will not be executed.
        System.out.println("End of try block.");
    }

}
