package FirstTutorialCompliteBeginer.GenericAndWildcastTurorial;

import java.util.ArrayList;

/**
 * Created by ksza on 07.03.2017.
 */
class Machine{
    @Override
    public String toString() {
        return "I am a Machine";
    }

    public void start(){
        System.out.println("Machine started");
    }
}
class Camera extends Machine{
    @Override
    public String toString() {
        return "I am a Camera";
    }

    public void start(){
        System.out.println("Camera starting");
    }
}
public class App {
  /*  public static void main(String[] args){

        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());
        showList(list1);

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());
        list2.add(new Camera());
        showList(list2);
        showList2(list1);
    }

    public static void showList(ArrayList<? extends Machine> list){
        for(Machine valueOfList : list){
            System.out.println(valueOfList);
            valueOfList.start();

        }
    }

    public static void showList2(ArrayList<? super Camera> list) {
        for (Object valueOfList : list) {
            System.out.println(valueOfList);
        }
    }
    */

}
