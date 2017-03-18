package FirstTutorialCompliteBeginer.MulipleExeptionsTutorial;

import jdk.nashorn.internal.runtime.ParserException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Created by ksza on 09.03.2017.
 */
public class TestExeptiom {
    public void run() throws IOException, ParseException {
       // throw new IOException();

        throw  new ParseException("Cannot parse Conssole", 2);
    }
    public void input() throws FileNotFoundException, IOException{
    }
}
