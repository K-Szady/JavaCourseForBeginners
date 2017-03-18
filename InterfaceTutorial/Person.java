package FirstTutorialCompliteBeginer.InterfaceTutorial;

/**
 * Created by ksza on 05.03.2017.
 */
public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet(){
        System.out.println("Greeting");
    }

    @Override
    public void showInfo() {
        System.out.println("Hello my name is :" + name);
    }
}
