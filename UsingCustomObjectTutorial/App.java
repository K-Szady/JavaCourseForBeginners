package FirstTutorialCompliteBeginer.UsingCustomObjectTutorial;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ksza on 15.03.2017.
 */
class Person{
    private int id;
    private String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "{ Id is :" + id + " and name :" + name + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
public class App {
    public static void main(String[] args){

        Person p1 = new Person(1,"Bob");
        Person p2 = new Person(2,"Sue");
        Person p3 = new Person(1,"Bob");
        Person p4 = new Person(4,"ToM");
        Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

        System.out.println("Map: ");
        map.put(p1,1);
        map.put(p2,2);
        map.put(p3,3);
        map.put(p4,1);

        for (Person key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

        Set<Person> personSet = new LinkedHashSet<Person>();
        System.out.println("\nSet: ");
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(p3);
        personSet.add(p4);
        for (Person setPerson: personSet){
            System.out.println(setPerson);
        }
    }
}
