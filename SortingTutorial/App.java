package FirstTutorialCompliteBeginer.SortingTutorial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ksza on 16.03.2017.
 */
class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "[ Id : " + id + " Name: " + name + " ]" ;
    }
}
class StringLengthCompartor implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();

        if(len1 > len2){
            return 1;
        }else if (len1 < len2){
            return -1;
        }

        return 0;
    }
}
class AlphabeticalCompartor implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /// to have reverse sort we need to add " - "
        return o1.compareTo(o2);
    }
}
public class App {
    public static void main(String[] args){
        //////////////////////// Sorting Strings ///////////////////
        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("mouse");
        animals.add("tiger");
        animals.add("lion");
        animals.add("alligator");

       // Collections.sort(animals, new StringLengthCompartor());
        Collections.sort(animals, new AlphabeticalCompartor());

        for (String animal: animals){
            System.out.println(animal);
        }
        //////////////////////// Sorting Integer /////////////////////

        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(17);
        numbers.add(5);
        numbers.add(10);
        numbers.add(46);
        numbers.add(87);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // if we wont to have reverse sort we need to add " - "
                return o1.compareTo(o2);
            }
        });

        for (Integer number: numbers){
            System.out.println(number);
        }

        //////////////////////// Sorting Objects /////////////////////

        List<Person> personList = new ArrayList<Person>();
        Person p1 = new Person(4,"Bob");
        Person p2 = new Person(17, "Kelly");
        Person p3 = new Person(12, "Sue");
        Person p4 = new Person(1, "Tupac");
        Person p5 = new Person(32, "John");

        personList.add(p3);
        personList.add(p5);
        personList.add(p1);
        personList.add(p4);
        personList.add(p2);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                if(o1.getId() > o2.getId()){
                    return 1;
                }
                else if(o1.getId()< o2.getId()){
                    return -1;
                }

                return 0;
            }
        });

        for(Person person : personList){
            System.out.println(person);
        }

    }

}
