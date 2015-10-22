/**
 * Created by Otto_2 on 10/19/2015.
 */
public class FrontDesk extends Thread {
    public int deskID;
    public FrontDesk(int number)
    {
        this.deskID = number + 1;
        System.out.println("Front Desk Employee  " + deskID + " has entered the matrix.");

    }
    public void run()
    {
        System.out.println("Front Desk Employee No." + deskID + " is set up and ready to start working");
    }
}
