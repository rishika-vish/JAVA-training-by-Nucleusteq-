package phone;

public interface MusicPlayer {
    void play();
    void stop();

    default void demo() {
        System.out.println("This is a demo function in the MusicPlayer interface.");
    }
}
