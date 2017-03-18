package FirstTutorialCompliteBeginer.TransientTutorial;

import java.io.Serializable;

/**
 * Created by ksza on 14.03.2017.
 */

public class Person implements Serializable {
    //// value of trasinet field is set to default after deserialization
    private transient int id;
    private String name;
    /// value of static field is also set to default after deserialization
    private static int count;

    public Person(int id, String name){
        this.id = id ;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}'+ " Count is; " + count;
    }
}
