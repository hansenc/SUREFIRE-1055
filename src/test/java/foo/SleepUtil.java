package foo;

public class SleepUtil
{
    public static void sleep()
    {
        /* a sleep seems to make the issue less likely to occur */
//        try
//        {
//            Thread.sleep(2000);
//        }
//        catch (InterruptedException e)
//        {
//            Thread.currentThread().interrupt();
//        }
    }
}
