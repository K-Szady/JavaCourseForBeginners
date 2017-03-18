package FirstTutorialCompliteBeginer.TryWithResourcesTutorial;

import java.io.*;

/**
 * Created by ksza on 10.03.2017.
 */
/*class Tempt implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }
}
*/
public class App {
    public static void main(String[] args){
  //      try (Tempt tempt = new Tempt()) {
  //      }catch (Exception e){
  //          System.out.println("Unable to close file");
  //      }

        File file = new File("C:\\Users\\ksza\\IdeaProjects\\JTfCB-onlineCourse01\\src\\FirstTutorialCompliteBeginer\\TryWithResourcesTutorial\\test.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line= br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
          System.out.println("file not found: " + file.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
