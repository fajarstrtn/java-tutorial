
public class TrainStation {

    public static void main(String[] args) {

        Train monorail = new Monorail();

        monorail.setType("straddle monorail");
        monorail.setColor("blue");
        monorail.setCapacity(300);

        monorail.run();
        monorail.stop();
        monorail.dropOff("sentosa monorail");
        monorail.info();
        monorail.maintain();

        Train.wheelTrainTotal(monorail.getType());

        Train tram = new Tram();

        tram.setType("low-floor tram");
        tram.setColor("red");
        tram.setCapacity(250);

        if (tram instanceof Tram tramParam)
            tramParam.hasFlexibleTrack(true);

        tram.run();
        tram.stop();
        tram.dropOff("alexanderplatz");
        tram.info();
        tram.maintain();

        Train.wheelTrainTotal(tram.getType());

    }
}
