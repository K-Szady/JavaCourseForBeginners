package FirstTutorialCompliteBeginer.SerializationTutorial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ksza on 13.03.2017.
 */
public class WriteObject {
    public static void main(String[] args){
        System.out.println("Writing Object.....");

        Person mike = new Person(543, "Mike");
        Person sue = new Person(123, "Sue");

        Person[] persons = {new Person(1, "Chris"), new Person(50,"July"), new Person(99,"Piter") };

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(persons));

        try(FileOutputStream fs = new FileOutputStream("people.bin")){

            ObjectOutputStream os = new ObjectOutputStream(fs);
            //// Writing Single Object
            System.out.println("Writing single person");
            os.writeObject(mike);
            os.writeObject(sue);
            //// Arrays of Object

            System.out.println("Writing normal array");
            os.writeObject(persons);
            System.out.println("Wrting ArrayList of Persons");
            os.writeObject(peopleList);
            System.out.println("Writing one-by-one for ArrayList of Persons");
            os.writeInt(peopleList.size());
            for(Person person : peopleList){
                os.writeObject(person);
            }

            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
