package FirstTutorialCompliteBeginer.EnumTypesTutorial;

/**
 * Created by ksza on 13.03.2017.
 */
public enum Animal {
    DOG("Tupac"), CAT("Tom"), MOUSE("Szczur");
    private String name;
    Animal(String  name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "This animal is called: " + name;
    }
}
