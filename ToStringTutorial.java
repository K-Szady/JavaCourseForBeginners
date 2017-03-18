package FirstTutorialCompliteBeginer;

/**
 * Created by ksza on 05.03.2017.
 */
class Zaba{
    private String name;
    private int id;

    public Zaba(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return  sb.toString();
    }
}
public class ToStringTutorial {
  /*  public static void main(String[] args){
        Zaba zaba1 = new Zaba("Gogus", 2);
        Zaba zaba2 = new Zaba("Felek",4);

        System.out.println(zaba1);
        System.out.println(zaba2);
    }
    */
}
