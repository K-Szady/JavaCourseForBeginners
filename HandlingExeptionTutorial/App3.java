package FirstTutorialCompliteBeginer.HandlingExeptionTutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ksza on 09.03.2017.
 */
public class App3 {
    public static void main(String[] args){
        System.out.println("Openning file:");
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open file");
        }


    }
    public static void openFile() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);
    }
}
