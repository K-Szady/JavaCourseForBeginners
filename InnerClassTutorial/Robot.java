package FirstTutorialCompliteBeginer.InnerClassTutorial;

/**
 * Created by ksza on 13.03.2017.
 */
public class Robot {
    private int id;

    private class Brain{
        public void think(){
            System.out.println("I'm Robot of id: " + id +" and im thinking");
        }
    }

    public static class Battery{
        public void charg(){
            System.out.println("Battery charging");
        }
    }
    public void start(){
        Robot.Battery battery = new Robot.Battery();
        battery.charg();
        System.out.println("My id is: " + id);
        Brain brain = new Brain();
        brain.think();

        final String name = "Robert";
        class Tempt{
            public void doSomthing(){
                System.out.println("My id is: " + id + " and i have name:  " + name);

            }
        }
        Tempt tempt = new Tempt();
        tempt.doSomthing();
    }

}
