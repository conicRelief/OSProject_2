/**
 * Created by Otto_2 on 10/19/2015.
 */
public class BellHop extends Thread {
    public int bellhopID;
    public BellHop(int number)
    {
        this.bellhopID = number + 1;
        System.out.println("BellHop  " + bellhopID + " has entered the matrix.");

    }
    public void run()
    {
        System.out.println("Belhopp No." + bellhopID +  " has clocked in and is ready to start working");
    }
}
