/**
 * Created by Otto_2 on 10/19/2015.
 */
public class FrontDesk extends Thread {
    public int deskID;
    public FrontDesk(int number)
    {
        int deskID = number;
    }
    public void run()
    {
        System.out.println("Front Desk No." + deskID + " is set up and ready to operate");
    }
}
