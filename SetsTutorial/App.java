package FirstTutorialCompliteBeginer.SetsTutorial;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ksza on 15.03.2017.
 */
public class App {
    public static void main(String[] args){
        // hashSet does not retain order
        // Set<String> set1 = new HashSet<String>();

        //LinkedHashSet remember the order you adding to it
        Set<String> set1 = new LinkedHashSet<String>();
        if(set1.isEmpty()){
            System.out.println("Set is empty");
        }
        System.out.println("LinkedHashSet: ");
        set1.add("dog");
        set1.add("snake");
        set1.add("mouse");
        set1.add("bear");
        set1.add("cat");
        System.out.println(set1);

        //TreeSet set in natural order
        Set<String> set2 = new TreeSet<String>();
        System.out.println("TreeSet: ");
        set2.add("dog");
        set2.add("snake");
        set2.add("mouse");
        set2.add("bear");
        set2.add("cat");
        System.out.println(set2);
        // Adding duplicate items does nothing

        // set1.add("dog");
        // System.out.println(set1);

        ////////    Iteriation/////////

        for(String animal :set1){
            System.out.println(animal);
        }


        //////     Does set contein agiven item

        if(set1.contains("Chiken")){
            System.out.println("Contain chiken");
        }
        if(set2.contains("bear")){
            System.out.println("Contein bear");
        }

        ////////  set3 contain some same items as set2      //////////////
        Set<String> set3 = new TreeSet<String>();
        set3.add("dog");
        set3.add("snake");
        set2.add("griffe");
        set2.add("zebra");
        set2.add("lion");
                ///////    Intersection  --> looking for common parts   //////////////
        Set<String> intersection = new HashSet<String>(set2);
        System.out.println("common part of sets: ");
        intersection.retainAll(set3);
        System.out.println(intersection);
                //////      Differences --> looking for unique items  /////////////
        Set<String> differences = new HashSet<String>(set2);
        differences.removeAll(set3);
        System.out.println(differences);

    }
}
