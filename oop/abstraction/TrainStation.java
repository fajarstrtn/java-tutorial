
public class TrainStation {

    public static void main(String[] args) {

        Train monorail = new Monorail();
        monorail.setType("Straddle Monorail");
        monorail.setColor("Blue");
        monorail.setCapacity(300);
        monorail.run();
        monorail.stop();
        monorail.dropOff("Sentosa Monorail");
        monorail.info();
        monorail.maintain();
        Train.wheelTrainTotal(monorail.getType());

        Train tram = new Tram();
        tram.setType("Low-floor Tram");
        tram.setColor("Red");
        tram.setCapacity(250);

        if (tram instanceof Tram tramParam) {
            tramParam.hasFlexibleTrack(true);
        }

        tram.run();
        tram.stop();
        tram.dropOff("Alexanderplatz");
        tram.info();
        tram.maintain();

        Train.wheelTrainTotal(tram.getType());

    }

}
