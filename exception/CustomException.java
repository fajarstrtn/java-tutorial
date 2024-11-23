
public class CustomException {

    public static void main(String[] args) {

        String input = "10";

        try {

            boolean isInputValid = validateUserInput(input);
            System.out.println("Is input valid? " + isInputValid);

        } catch (NoIntegerValueAllowedException e) {

            System.err.println(e.getMessage());

        }

    }

    private static boolean validateUserInput(Object input) throws NoIntegerValueAllowedException {

        if (input.getClass().getName().equals("java.lang.String")) {
            throw new NoIntegerValueAllowedException("No integer value allowed in this method");
        }

        return true;
        
    }
}

class NoIntegerValueAllowedException extends IllegalArgumentException {

    public NoIntegerValueAllowedException(String exception) {
        super(exception);
    }

}
