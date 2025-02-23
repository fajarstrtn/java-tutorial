public class MusicStudio {

    public static void main(String[] args) {

        Instrument bass = new Guitar();

        bass.name = "acoustic guitar";
        bass.brand = "yamaha";
        bass.type = "string";
        bass.material = "wood";
        bass.price = 120;
        bass.isTuned = false;

        /* it triggers an error since stringTotal is attribute of Guitar class.
        bass.stringTotal = 6; */

        bass.tune();
        bass.play();

        /* also, these methods are part of Guitar class.
        bass.strum();
        bass.changeString(4); */
        
        Guitar guitar = new Guitar();

        guitar.name = "acoustic guitar";
        guitar.brand = "yamaha";
        guitar.type = "string";
        guitar.material = "wood";
        guitar.price = 120;
        guitar.isTuned = false;
        guitar.stringTotal = 6;

        guitar.tune();
        guitar.play();
        guitar.strum();
        guitar.changeString(4);

    }
}