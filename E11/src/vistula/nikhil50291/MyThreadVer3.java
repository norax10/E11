package vistula.nikhil50291;

public class MyThreadVer3 implements Runnable
{

    Thread thread;

    MyThreadVer3(String name)
    {

        thread = new Thread(this, name);
    }

    public static MyThreadVer3 createAndstart(String name)
    {
        MyThreadVer3 myThreadVer3 = new MyThreadVer3(name);
        myThreadVer3.thread.start();
        return myThreadVer3;
    }

    public void run()
    {

        System.out.println(thread.getName() + "starts to operats");
        try
        {
            for (int count = 0; count < 10; count++)
            {
                Thread.sleep(100);
                System.out.println(thread.getName() + "is executed, the counter value: count");
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(thread.getName() + "has been interrupted");
        }
        System.out.println(thread.getName() + "Finishes running.");
    }
}
