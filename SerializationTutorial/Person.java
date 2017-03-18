package FirstTutorialCompliteBeginer.SerializationTutorial;

import java.io.Serializable;

/**
 * Created by ksza on 13.03.2017.
 */
public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
