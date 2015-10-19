import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by Otto_2 on 10/19/2015.
 */

public class Guest extends Thread {
    int bags;
    static int guestCount = 0;
    int guestID;
    static Semaphore guestSemaphore;
    public Guest(int number)
    {
        Random r = new Random();
        bags = r.nextInt(4);
        guestID = number;
    }
    public void run()
    {
        System.out.println("Guest "+ guestID +  " has arrived.");
    }
}
