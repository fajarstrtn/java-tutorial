
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

    public void setSpecies(String species) {

        this.species = species;

    }

    public void setIsMammals(Boolean isMammals) {

        this.isMammals = isMammals;

    }

    public String getName() {

        return this.name;

    }

    public String getSpecies() {

        return this.species;

    }

    public Boolean getIsMammals() {

        return this.isMammals;

    }

    @Override
    public String toString() {
        return "Animal{"
                + "name='" + this.name + "', species='" + this.species + "', isMammals=" + this.isMammals
                + "}";
    }

    public static void main(String[] args) {

        Animal cat = new Animal("mio", "felis_catus", true);

        logger.log(Level.INFO, cat);
        

        Animal dog = new Animal();

        dog.setName("loki");
        dog.setSpecies("family_canidae");
        dog.setIsMammals(true);

        logger.log(Level.INFO, dog);

        Animal frog = new Animal();

        frog.setName("leiya");
        frog.setSpecies("anora");
        frog.setIsMammals(false);

        logger.log(Level.INFO, frog);

    }

}
