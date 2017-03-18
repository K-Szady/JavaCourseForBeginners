package FirstTutorialCompliteBeginer.SerializationTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by ksza on 13.03.2017.
 */
public class ReadObject {
    public static void main(String[] args){
        System.out.println("Reading Objects...");

     try (FileInputStream fi = new FileInputStream("people.bin")){

         ObjectInputStream oi = new ObjectInputStream(fi);
         ///Reading Single object
         System.out.println("Reading single Object");
         Person person1 = (Person) oi.readObject();
         Person person2 = (Person) oi.readObject();
         System.out.println(person1);
         System.out.println(person2);
         ///// Arrays of Object
         System.out.println("Reading normal array");
         Person[] people = (Person[]) oi.readObject();
            for(Person person: people){
                System.out.println(person);
            }
         System.out.println("Reading ArrayList of Persons");
         ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();
            for(Person personFromAL: peopleList){
                System.out.println(personFromAL);
            }

         System.out.println("Reading one-by-one form ArrayList");
         int  num = oi.readInt();

         for (int i = 0; i< num; i++){
             Person person = (Person) oi.readObject();
             System.out.println(person);
         }
         oi.close();

     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }
    }
}
