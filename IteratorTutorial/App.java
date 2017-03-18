package FirstTutorialCompliteBeginer.IteratorTutorial;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksza on 17.03.2017.
 */
public class App {
    public static void main(String[] args){
        List<String> animals = new LinkedList<String>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");

        ////// modern java 5
        Iterator<String> it = animals.iterator();

        while(it.hasNext()){
           String value = it.next();
           System.out.println(value);
           // we can remove elements form this iterator
            if(value.equals("cat")){
                it.remove();
            }
        }
            System.out.println();
        for(String animal: animals){
            System.out.println(animal);

            /// but we cant remove elements form here
        }
    }
}
