package FirstTutorialCompliteBeginer.ReadingFilesUsingScannerTutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ksza on 09.03.2017.
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\ksza\\IdeaProjects\\JTfCB-onlineCourse01\\src\\FirstTutorialCompliteBeginer\\ReadingFilesUsingScannerTutorial\\example.txt";
        File exampleFile = new File(fileName);
        Scanner fileRead = new Scanner(exampleFile);
        int value = fileRead.nextInt();
        System.out.println("Read value: " + value);
        fileRead.nextLine();

        int count = 2;
        while (fileRead.hasNextLine()){
            String line = fileRead.nextLine();
            System.out.println(count +": " + line);
            count++;
        }
        fileRead.close();
    }
}
