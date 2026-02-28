package threads;

public class ResultDec{

    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval......");
        wait();
        System.out.println("Result Declared");
    }

    synchronized void approve(){
        notify();
    }

    public static void main(String[]args) throws Exception{

        ResultDec res=new ResultDec();

        new Thread(() ->{
            try{
                res.declareResult();
            }catch(Exception e){}
        }).start();

        Thread.sleep(2000);

        new Thread(() ->{
            res.approve();
        }).start();
    }
}
/*
The declareResult() method waits until another thread calls
notify().During wait(), the thread releases the lock,allowing
other threads to enter the synchronized code.
ℹ️Points to remember
⭐sleep()->time based
⭐wait()->condition based
⭐wait()->releases lock->by checking the notify() method
⭐wait() is used in intern-threaded communication
☑️Order-Placed->Preparing->Prepared->Delivering->Delivered
 */