
public class Superstar {

    public static void main(String[] args) {

        Superstar[] superstars = {
            new Superstar("sabrina carpenter", "espresso"),
            new Superstar("justin bieber", "baby"),
            new Superstar("charlie puth", "see you again")};

        int size = superstars.length;

        for (int member = 0; member < size; ++member) {
            System.out.print(superstars[member].getName() + " " + superstars[member].getSong() + "\n");
        }

    }

    private String name;

    private String song;

    public Superstar(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return this.name;
    }

    public String getSong() {
        return this.song;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(String song) {
        this.song = song;
    }
    
}
