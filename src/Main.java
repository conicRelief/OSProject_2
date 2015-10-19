/**
 * Created by Otto_2 on 10/19/2015.
 */
public class Main {

    public static void main(String[] args)
    {
        for(int i = 0 ; i < 10; i++)
        {
            new Guest(i).start();
//            try {
//                a.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        }
}
