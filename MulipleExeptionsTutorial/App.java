package FirstTutorialCompliteBeginer.MulipleExeptionsTutorial;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by ksza on 09.03.2017.
 */
public class App {
    public static void main(String[] args) {
        TestExeptiom testExeptiom = new TestExeptiom();
        try {
            testExeptiom.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            testExeptiom.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
