import com.sun.corba.se.impl.orbutil.concurrent.CondVar;
import sun.font.TrueTypeFont;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by Otto_2 on 10/19/2015.
 */

public class Guest extends Thread {
    int bags;
    static int guestCount = 0;
    int guestID;
    ThreadMonitor guestSemaphore;
    public Guest(int number, ThreadMonitor tm)
    {
        Random r = new Random();
        bags = r.nextInt(4) + 1;
        guestID = number + 1;
        System.out.println("Guest " + guestID + " has entered the matrix.");
    }
    public void run()
    {
        System.out.println("Guest "+ guestID +  " has arrived. This guest is carrying " + bags + " bag(s)");
        guestSemaphore.ready(this);
        
    }
}
