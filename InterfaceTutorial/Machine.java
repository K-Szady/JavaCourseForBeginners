package FirstTutorialCompliteBeginer.InterfaceTutorial;

/**
 * Created by ksza on 05.03.2017.
 */
public class Machine implements Info {
    private int id = 8;
    public void start(){
        System.out.println("Machine started");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }
}
