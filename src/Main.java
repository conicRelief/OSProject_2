import java.util.concurrent.Semaphore;

/**
 * Created by Otto_2 on 10/19/2015.
 */
public class Main {
    static final int numberOfGuests = 15;
    static final int numberOfBellHops = 2;
    static final int numberOfDesks = 2;

    public static void main(String[] args)
    {
        ThreadMonitor tm = new ThreadMonitor();
        System.out.println("Starting Simulation...");
        for(int i = 0 ; i < numberOfGuests; i++)
        {
            new Guest(i,tm).start();
        }
        for(int i = 0 ; i < numberOfBellHops; i++)
        {
            new BellHop(i).start();
        }
        for(int i = 0 ; i <numberOfDesks; i++)
        {
            new FrontDesk(i).start();
        }
        }
}
