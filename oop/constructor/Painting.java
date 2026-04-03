
public class Painting {

    private String name;
    private String technique;

    public Painting() {
    }

    public Painting(String name, String technique) {
        this.name = name;
        this.technique = technique;
    }

    /*
     * Unlike other constructors, copy constructor is passed with another object
     * which copies the data available from the passed object to the newly created object.
     * You can create our own copy constructor by passing the object of the same class
     * to the other instance(object) of the class. */
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

    public static void main(String[] args) {
        var watercolor = new Painting();
        watercolor.setName("Watercolor");
        watercolor.setTechnique("Watercolor Painting is a technique that uses water-soluble pigments to create a transparent, luminous effect.");
        System.out.println(watercolor.getName());
        System.out.println(watercolor.getTechnique());

        var oilPainting = new Painting("Oil Painting", "oil painting is a popular medium that uses pigments mixed with oil, typically linseed oil, as a binder.");
        System.out.println(oilPainting.getName());
        System.out.println(oilPainting.getTechnique());

        var modernOilPainting = new Painting(oilPainting);
        System.out.println(modernOilPainting.getName());
        System.out.println(modernOilPainting.getTechnique());
    }

}
