package FirstTutorialCompliteBeginer.ImplementingIterableTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by ksza on 17.03.2017.
 */
public class UrlLibrary implements Iterable<String> {
    private LinkedList<String> urls = new LinkedList<String>();
    StringBuilder sb = new StringBuilder();
     public UrlLibrary(){
         urls.add("https://www.facebook.com/");
         urls.add("https://www.udemy.com/courses/");
     }
     private class UrlIterator implements Iterator<String>{

         private int index = 0;

         @Override
         public boolean hasNext() {
             return index < urls.size();
         }

         @Override
         public String next() {

             try {
                 URL url = new URL(urls.get(index));
                 BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                 String line = null;
                 while ((line=br.readLine())!= null){
                     sb.append(line);
                     sb.append("\n");
                 }
                 br.close();

             } catch (MalformedURLException e) {
                 e.printStackTrace();
             } catch (IOException e) {
                 e.printStackTrace();
             }

             index++;
             return sb.toString();
         }

             @Override
         public void remove() {
            urls.remove(index);
         }
     }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*@Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */
}
