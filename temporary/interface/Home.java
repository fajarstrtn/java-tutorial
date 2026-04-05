// In Java, an interface can have a main method starting from Java 8.
// However, it works a bit differently from how classes use it.
// It's not very common to do this in practice, but it's perfectly legal and can be useful for testing or demo purposes inside an interface.

public interface Home {

    public static void main(String[] args) {
        System.out.println("I'm home now.");
    }

}
