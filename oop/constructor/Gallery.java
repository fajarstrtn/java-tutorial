
public class Gallery {

    public static void main(String[] args) {

        Painting watercolor = new Painting();

        watercolor.setName("watercolor");
        watercolor.setTechnique("watercolor painting is a technique that uses water-soluble pigments to create a transparent, luminous effect.");

        System.out.println(watercolor.getName());
        System.out.println(watercolor.getTechnique());

        Painting oilPainting = new Painting("oil painting", "oil painting is a popular medium that uses pigments mixed with oil, typically linseed oil, as a binder.");

        System.out.println(oilPainting.getName());
        System.out.println(oilPainting.getTechnique());

        Painting modernOilPainting = new Painting(oilPainting);

        System.out.println(modernOilPainting.getName());
        System.out.println(modernOilPainting.getTechnique());

    }
    
}
