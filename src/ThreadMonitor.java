import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by Otto_2 on 10/21/2015.
 */
public class ThreadMonitor {

    Deque<Guest> availableGuestsQueue = new LinkedList<Guest>();
    Deque<BellHop> availableBellHopsQueue = new LinkedList<BellHop>();
    Deque<FrontDesk> frontDeskEmployeesQueue = new LinkedList<FrontDesk>();

    public void ready(Object o) {
        System.out.println("Object we're adding: " + o.getClass().getCanonicalName() );

        if (o instanceof Guest) {

        } else if (o instanceof BellHop) {

        }
        else if( o instanceof FrontDesk) {

        }
        else
        {
            System.out.println("Error");
        }
    }
    public void block(Object o)
    {


    }

    public void error(String s)
    {
        System.out.println("Error: " + s );
    }
    public void print(String s)
    {


    }
}