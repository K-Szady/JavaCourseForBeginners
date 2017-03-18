package FirstTutorialCompliteBeginer.ArrayListTutorial;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ksza on 14.03.2017.
 */
public class App {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        ///Retriving
        System.out.println(numbers.get(0));

        // indexed for loop iteration
        System.out.println("\nIteration nr 1: ");

        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("\nIteration nr 2: ");

        for (Integer values: numbers){
            System.out.println(values);
        }
        //// removing(careful with that)

        numbers.remove(0);
        numbers.remove(numbers.size() -1);

        System.out.println("After removing Iteration: ");
        for(Integer value: numbers){
            System.out.println(value);
        }

        /// Creating ArrayList using List interface

        List<String> arrayList = new ArrayList<String>();
    }
}
