package FirstTutorialCompliteBeginer.QueuesTutorial;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by ksza on 17.03.2017.
 */
public class App {
    public static void main(String[] args){
        /// (head) <- ooooooooooooooooo <-(tail) fifo = first in first out

        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        //Throws expetion - there is nothing in queue
        //System.out.println("Queue Value is : " + q1.element());

        q1.add(10);
        q1.add(20);
        q1.add(30);
        System.out.println("Head of the queue: " + q1.element());
       try {
           q1.add(40);
       }catch (IllegalStateException e){
           System.out.println("Tried to add to mutch intems in queue");
       }

       for (Integer value: q1){
           System.out.println("Queue value: " + value);
       }

        System.out.println("Removed form queue: " + q1.remove());
        System.out.println("Removed form queue: " + q1.remove());
        System.out.println("Removed form queue: " + q1.remove());
        try{
            System.out.println("Removed form queue: " + q1.remove());
        }catch (NoSuchElementException e){
            System.out.println("Tried to remove to much itmes form queue");
        }

        /////////////////////////////   Methods without exceptions   ///////////////////////////////
        System.out.println("Queue methods without exceptions");
        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
        // if its null this will return null, no like element throw exception

        System.out.println("Head of the queue: " + q2.peek());

        /// if we tried to add to much itmes in queue using Offer it will return false

        q2.offer(10);
        q2.offer(20);
        if(q2.offer(30)== false){
            System.out.println("Tried to add to much items in the queue");
        }
        System.out.println("Head of the queue: " + q2.peek());
        /// Poll method is working like remove, just dont throw wxeption and return null if queue is already empty
        System.out.println("Remove item form queue: " + q2.poll());
        System.out.println("Remove item form queue: " + q2.poll());
        System.out.println("Remove item form queue: " + q2.poll());
    }
}
