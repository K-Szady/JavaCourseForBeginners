package FirstTutorialCompliteBeginer.LinkedListTutorial;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ksza on 15.03.2017.
 */
public class App {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        System.out.println("Adding index at the end of the Array");
        doTaimingAtTheEnd("ArrayList", arrayList);
        doTaimingAtTheEnd("LinkedList", linkedList);

        System.out.println("Adding index form the start of the Array");
        doTaimingAtTheStart("ArrayList", arrayList);
        doTaimingAtTheStart("LinkedList", linkedList);
    }

    public static void doTaimingAtTheEnd(String type, List<Integer> list){
        for(int i =0; i<1E5;i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();
        //"Adding at the end of the list: ");
        for(int i = 0 ; i<1E5; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);
    }
    public static void doTaimingAtTheStart(String type, List<Integer> list){
        for(int i =0; i<1E5;i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        //"Adding from the beggining of the list: ");
        for(int i = 0; i<1E5; i++){
            list.add(0,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + type);

    }
}
