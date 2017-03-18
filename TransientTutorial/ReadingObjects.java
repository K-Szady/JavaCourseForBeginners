package FirstTutorialCompliteBeginer.TransientTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by ksza on 14.03.2017.
 */
public class ReadingObjects {
    public static void main(String[] args){
        System.out.println("Reading Objects...");

        try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("test.ser"))){

        Person person = (Person) oi.readObject();
        System.out.println(person);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
