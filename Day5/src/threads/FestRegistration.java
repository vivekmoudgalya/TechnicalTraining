package threads;

public class FestRegistration
{
    static class FormFilling extends Thread{
        public void run()
        {
            System.out.println("Form Filling Started");
        }
    }
    static class DocumentsUpload extends Thread{
        public void run()
        {
            System.out.println("document upload started");
        }
    }
    static class EmailNotification extends Thread
    {
        public void run()
        {
            System.out.println("confirmation email sent");
        }
    }
    public static void main(String[] args) {
        FormFilling t1=new FormFilling();
        DocumentsUpload t2=new DocumentsUpload();
        EmailNotification t3=new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}

/* ℹ️points to remember
⭐Java program starts with one main thread
⭐Threads allow parallel execution->concurrency
⭐Output order is not guaranteed
⭐threads share the same memory
⭐Improves the performance & responsiveness
⭐when start() is called,the JVM creates a new Thread
⭐when run() is called directly,there is no concurrency
ℹ️process v/s thread
⭐Process is a running program
⭐Thread: A path of execution inside the program
⭐A process has it's own memory
⭐Threads share the same memory
⭐Creating a thread is cheaper than creating a process
⭐examples:process->chrome browser thread->new tab
✅closing a tab will not close chrome or kill chrome
*/
