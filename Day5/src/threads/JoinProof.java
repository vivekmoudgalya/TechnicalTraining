package threads;

public class JoinProof
{
    static class Task extends Thread
    {
        public void run()
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {

            }
            System.out.println("Task finished!!");
        }
    }
    public static void main(String[] args)throws InterruptedException {
        Task t =new Task();
        t.start();// The main thread dosen't wait for this Thread
        t.join();//code will wait (guaranteed!!)
        System.out.println("Main Thread Resume");
    }
}
