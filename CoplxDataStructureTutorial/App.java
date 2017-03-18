package FirstTutorialCompliteBeginer.CoplxDataStructureTutorial;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ksza on 17.03.2017.
 */
public class App {

    public static String[] vehicles = {
      "ambulacne", "helicopter", "lifeboat"
    };

    public static String[][] drivers = {
            {"Bob", "Fred" , "Sue"},
            {"Sue ", "Tupac ", "Richard ", "Fred "},
            {"Pete ", "Mary " , "Bob "},
    };
    public static void main(String[] args){

        Map<String, Set<String>> personels = new HashMap<>();

        for(int i = 0; i<vehicles.length; i++){
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];
            Set<String> driverSet = new LinkedHashSet<>();
            for(String driver: driversList){
                driverSet.add(driver);
            }


            personels.put(vehicle,driverSet);

        }


    }
}
