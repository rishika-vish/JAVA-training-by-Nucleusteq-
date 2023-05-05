package phone;

public interface Camera {
    void click();
    void record();

    default void demo() {
        System.out.println("This is a demo function in the Camera interface.");
    }
}