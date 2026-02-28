package threads;

public class DeadlockDemo
{
    static final Object accountA=new Object();
    static final Object accountB=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(() ->
        {
           synchronized (accountA)
           {
               System.out.println("Thread 1 locked account A");
               try
               {
                   Thread.sleep(2000);
               }catch (Exception e){}
               synchronized (accountB)
               {
                   System.out.println("Thread 1 locked account B");
               }
           }
        });
        Thread t2=new Thread(() ->
        {
            synchronized (accountB)
            {
                System.out.println("Thread 2 locked account B");
                try
                {
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountA)
                {
                    System.out.println("Thread 2 locked account A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
/*
Thread - 1 acquires a lock on account A and then sleeps,giving
Thread - 2 to acquires a lock on Account B. Now , Thread-1 waits for
Account A & thread-2 waits for Account B. since neither thread
releases the lock. Both keep waiting & thus creating a DEADLOCK
ℹ️ DEADLOCK Explanation : Deadlock occurs when each thread is holding
a resource & waiting for the other to release it.
 */