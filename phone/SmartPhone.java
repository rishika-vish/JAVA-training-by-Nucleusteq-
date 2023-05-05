package phone;

public class SmartPhone extends phone implements Camera, MusicPlayer {
    @Override
    public void click() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void record() {
        System.out.println("Recording a video...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }

    @Override
    public void demo() {
        System.out.println("This is a demo function in the SmartPhone class.");
    }
}