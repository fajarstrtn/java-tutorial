
public class MusicStudio {

    public static void main(String[] args) {

        Instrument bass = new Guitar();
        bass.name = "Acoustic Guitar";
        bass.brand = "Yamaha";
        bass.type = "String";
        bass.material = "Wood";
        bass.price = 120;
        bass.isTuned = false;

        /* it triggers an error since stringTotal is attribute of Guitar class.
        bass.stringTotal = 6; */
        bass.tune();

        /* also, these methods are part of Guitar class.
        bass.strum();
        bass.changeString(4); */
        bass.play();

        Guitar guitar = new Guitar();
        guitar.name = "Acoustic Guitar";
        guitar.brand = "Yamaha";
        guitar.type = "String";
        guitar.material = "Wood";
        guitar.price = 120;
        guitar.isTuned = false;
        guitar.stringTotal = 6;
        guitar.tune();
        guitar.play();
        guitar.strum();
        guitar.changeString(4);

    }

}
