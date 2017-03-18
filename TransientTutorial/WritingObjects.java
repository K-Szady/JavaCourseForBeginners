package FirstTutorialCompliteBeginer.TransientTutorial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by ksza on 14.03.2017.
 */
public class WritingObjects {
    public static void main(String[] args){
     System.out.println("Writing Objects...");

        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))){
            Person person = new Person(7,"Bob");
            Person.setCount(78);
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
