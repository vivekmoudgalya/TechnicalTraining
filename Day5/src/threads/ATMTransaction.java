package threads;

public class ATMTransaction extends Thread
{
    public void run()
    {
        System.out.println("Processing ATM Transaction");

    }
    public static void main(String[] args) {
        ATMTransaction t=new ATMTransaction();
        System.out.println("Thread State:"+t.getState());//new
        t.start();
        System.out.println("Thread state after:"+t.getState());//runnable
    }
}
/*
ℹ️ points to remember
Initially the thread is the new state.after calling start(),
it moves to runnable and executes the run() method.
The exact timing of the state changes depend on the JVM Scheduler
ℹ️ Points to remember:
⭐Thread is created once
⭐start() chnges state
⭐thread cannot be restarted
⭐Final state is TERMINATED or DEAD
*/
