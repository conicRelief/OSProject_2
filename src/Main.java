/**
 * Created by Otto_2 on 10/19/2015.
 */
public class Main {
    static final int numberOfGuests = 25;
    static final int numberOfBellHops = 2;
    static final int numberOfDesks = 1;

    public static void main(String[] args)
    {
        for(int i = 0 ; i < numberOfGuests; i++)
        {
            new Guest(i).start();
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
