package FirstTutorialCompliteBeginer.ReadingFilesWithFileReader;

import java.io.*;

/**
 * Created by ksza on 10.03.2017.
 */
public class App {
    public static void main(String[] args){
        File file = new File("C:\\Users\\ksza\\IdeaProjects\\JTfCB-onlineCourse01\\src\\FirstTutorialCompliteBeginer\\ReadingFilesWithFileReader\\test.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }finally {

            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            }catch (NullPointerException ex){
                /// File was probably naver open
            }
        }

    }
}
