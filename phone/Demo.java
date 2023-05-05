package phone;

public class Demo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.call();
        phone.sms();

        phone.click();
        phone.record();

        phone.play();
        phone.stop();

        phone.demo(); // This calls the demo function in the SmartPhone class

        Camera camera = phone;
        camera.click();
        camera.record();
        camera.demo(); // This calls the demo function in the Camera interface

        MusicPlayer musicPlayer = phone;
        musicPlayer.play();
        musicPlayer.stop();
        musicPlayer.demo(); // This calls the demo function in the MusicPlayer interface
    }
}

