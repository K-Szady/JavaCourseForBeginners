package FirstTutorialCompliteBeginer.UpcastingDowncastingTutorial;

/**
 * Created by ksza on 06.03.2017.
 */
class Machine{
    public void start(){
        System.out.println("Machine started");
    }
}
class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera started");
    }
    public void snap(){
        System.out.println("Photo teken");
    }
}
public class App {
   /* public static void main(String[] args){
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        ///Upcasting

        Machine machine2 = camera1;
        machine2.start();

        //Downcasting

        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.snap();
        camera2.start();

        // Doesn't work --- runtime error.
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4
        // camera3.start();
        // camera3.snap();
    }
    */
}
