
public class Walkman implements MusicPlayer {

    private String type;

    public Walkman() {
        this.type = "Unknown Walkman";
    }

    public Walkman(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println(this.getType() + " is in the play.");
    }

    @Override
    public void stop() {
        System.out.println(this.getType() + " stops playing.");
    }

    public static void main(String[] args) {

        Walkman walkman = new Walkman();
        walkman.setType("Walkman NW-ZX300");
        walkman.play();
        walkman.stop();
        walkman.inform(walkman.getType());

    }

}

interface MusicPlayer {

    void play();

    void stop();

    /* Default method helps to add new implementation without breaking existing feature. */
    default void inform(String name) {
        System.out.println("User is listening to the music through " + name + ".");
    }

}
