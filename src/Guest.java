import java.util.Random;

/**
 * Created by Otto_2 on 10/19/2015.
 */

public class Guest extends Thread {
    int bags;
    static int guestCount = 0;
    int guestID;
    public Guest(int number)
    {
        Random r = new Random();
        bags = r.nextInt(4);
        guestID = number;
    }
    public void run()
    {
        System.out.println("RUNNING: \nGuestID: " + guestID);
    }
}
