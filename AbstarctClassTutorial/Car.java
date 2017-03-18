package FirstTutorialCompliteBeginer.AbstarctClassTutorial;

/**
 * Created by ksza on 09.03.2017.
 */
 class Car extends Machine {
    @Override
    public void start() {
     System.out.println("Starrting Car");
    }

    @Override
    public void doStaff() {
        System.out.println("Doing stuff in Car");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown Car");
    }
}
