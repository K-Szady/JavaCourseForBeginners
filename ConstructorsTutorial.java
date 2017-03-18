package FirstTutorialCompliteBeginer;

/**
 * Created by ksza on 04.03.2017.
 */
class Machine{
    private String name;
    private int code;

    public Machine(){
        System.out.println("First Constructor running");
    }

    public Machine(String name){
        this();
        this.name = name;
        System.out.println("Second Constructor running");
    }
    public Machine(int code){
        this("arni");
        this.code = code;
        System.out.println("Third Constarator running");
    }
}
public class ConstructorsTutorial {
  /*  public static void main(String[] args){
     Machine machine1 = new Machine();

     Machine machine2 = new Machine("Kubus");
     Machine machine3 = new Machine(6);
    }
    */
}
