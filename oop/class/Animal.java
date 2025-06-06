
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Animal {

    private static final Logger logger = System.getLogger(Animal.class.getName());

    private String name;
    private String species;
    private Boolean isMammals;

    public Animal() {
    }

    public Animal(String name, String species, Boolean isMammals) {
        this.name = name;
        this.species = species;
        this.isMammals = isMammals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void isMammals(Boolean isMammals) {
        this.isMammals = isMammals;
    }

    public Boolean isMammals() {
        return isMammals;
    }

    @Override
    public String toString() {
        return String.format("""
        {
            "name" : "%s",
            "species" : "%s",
            "isMammals" : "%b"
        }""", name, species, isMammals);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Mio", "Felis Catus", true);
        logger.log(Level.INFO, cat);

        Animal dog = new Animal();
        dog.setName("Loki");
        dog.setSpecies("Family Canidae");
        dog.isMammals(true);
        logger.log(Level.INFO, dog);

        Animal frog = new Animal();
        frog.setName("Leiya");
        frog.setSpecies("Anora");
        frog.isMammals(false);
        logger.log(Level.INFO, frog);

        Animal butterfly = new Animal();
        butterfly.setName("Nora");
        butterfly.setSpecies("Lepidoptera");
        butterfly.isMammals(false);
        logger.log(Level.INFO, String.format("""
        {
            "name" : "%s",
            "species" : "%s",
            "isMammals" : "%b"
        }""", butterfly.getName(), butterfly.getSpecies(), butterfly.isMammals()));
    }

}
