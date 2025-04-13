
public class Studio {

    public static void main(String[] args) {

        var camera = new Camera();
        camera.capture();
        camera.record();
        camera.useSmartEffect();

    }
}

interface CapturePhoto {

    void capture();

}

interface VideoRecording {

    void record();

}

interface AIFeature extends CapturePhoto, VideoRecording {

    void useSmartEffect();

}

class Camera implements AIFeature {

    @Override
    public void capture() {
        System.out.println("Camera is capturing single photo.");
    }

    @Override
    public void record() {
        System.out.println("Camera is recording a brand-new video.");
    }

    @Override
    public void useSmartEffect() {
        System.out.println("Camera is using smart effect.");
    }

}
