
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class FootBallClub {

    private static final Logger logger = System.getLogger(FootBallClub.class.getName());

    public String name;
    public Integer age;
    public Boolean isOnLoad;
    public Double price;

    public FootBallClub() {
        this.price = 0D;
    }

    public FootBallClub(String name) {
        this.name = name;
        this.price = 0D;
    }

    public FootBallClub(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.price = 0D;
    }

    public FootBallClub(String name, Integer age, Double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("""
        {
            "name": "%s",
            "age": "%d",
            "isOnLoad": "%b",
            "price": "%.2f"
        }""", name, age, isOnLoad, price);
    }

    public static void main(String[] args) {
        FootBallClub striker = new FootBallClub();
        striker.name = "Lionel Messi";
        striker.age = 37;
        striker.isOnLoad = false;
        striker.price = 220_000_000D;
        logger.log(Level.INFO, striker);

        FootBallClub winger = new FootBallClub("Bukayo Saka");
        logger.log(Level.INFO, winger);

        FootBallClub midfielder = new FootBallClub("Leroy Sane", 29);
        logger.log(Level.INFO, midfielder);

        FootBallClub defender = new FootBallClub("Ruben Diaz", 27, 71D);
        logger.log(Level.INFO, defender);
    }

}
