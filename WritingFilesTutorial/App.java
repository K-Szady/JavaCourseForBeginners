package FirstTutorialCompliteBeginer.WritingFilesTutorial;

import java.io.*;

/**
 * Created by ksza on 10.03.2017.
 */
public class App {
    public static void main(String[] args){
        File file = new File("text.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("This is line one");
            bw.newLine();
            bw.write("This is line two");
            bw.newLine();
            bw.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to create file: " + file.toString());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
