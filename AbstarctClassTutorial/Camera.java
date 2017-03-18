package FirstTutorialCompliteBeginer.AbstarctClassTutorial;

/**
 * Created by ksza on 09.03.2017.
 */
public class Camera extends Machine{
    @Override
    public void start() {
        System.out.println("Starting Camera");
    }

    @Override
    public void doStaff() {
        System.out.println("Doing stuff in camera");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown Camara");
    }
}
