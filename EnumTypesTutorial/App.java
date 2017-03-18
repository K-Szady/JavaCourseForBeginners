package FirstTutorialCompliteBeginer.EnumTypesTutorial;

/**
 * Created by ksza on 13.03.2017.
 */
public class App {
    public static void main(String[] args){
        Animal animal = Animal.CAT;
        switch (animal){

            case DOG:
                System.out.println("Dog");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case MOUSE:
                System.out.println("Mouse");
                break;
            default:
                System.out.println("thats cant be happening");
                break;
        }
        /// toString method override
        System.out.println(Animal.DOG);
        /// Constamt Enum name
        System.out.println(Animal.DOG.name());
        //// Checking Enum class or if it is a Objetc
        System.out.println(Animal.DOG instanceof Enum);
        System.out.println(Animal.DOG instanceof Object);
        /// Getting name of constant Enum
        System.out.println(Animal.CAT.getName());
    }
}
