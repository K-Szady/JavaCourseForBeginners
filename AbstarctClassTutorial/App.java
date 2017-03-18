package FirstTutorialCompliteBeginer.AbstarctClassTutorial;

/**
 * Created by ksza on 09.03.2017.
 */
public class App {
    public static void main(String[] args){
        Car car1 = new Car();
        Camera cam1 = new Camera();

        car1.setId(4);
        cam1.setId(5);

        car1.run();
        cam1.run();
    }
}
