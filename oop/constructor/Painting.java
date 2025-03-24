
public class Painting {

    private String name;
    private String technique;

    public Painting() {
    }

    public Painting(String name, String technique) {
        this.name = name;
        this.technique = technique;
    }

    /* Unlike other constructors, copy constructor is passed with another object which copies the data available from the passed object to the newly created object.
    User can create our own copy constructor by passing the object of the same class to the other instance(object) of the class. */
    public Painting(Painting painting) {
        this.name = painting.name;
        this.technique = painting.technique;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

}
