package FirstTutorialCompliteBeginer.HashMapTutorial;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ksza on 15.03.2017.
 */
public class App {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer,String>();

        map.put(5,"Five");
        map.put(4,"Four");
        map.put(7,"Seven");
        map.put(9,"Nine");
        map.put(1,"One");
        map.put(3,"Three");

        String text = map.get(4);
        System.out.println(text);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }
    }
}
