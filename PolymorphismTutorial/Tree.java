package FirstTutorialCompliteBeginer.PolymorphismTutorial;

/**
 * Created by ksza on 06.03.2017.
 */
public class Tree extends Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }
    public void shedLeaves(){
        System.out.println("Leaves shedding");
    }
}
