package Day6.InnerClass.anonymousInnerClass;

public interface Payment
{
    void pay();
}
class PaymentDemo
{
    public static void main(String[] args)
    {
        Payment p=new Payment()
        {
            public void pay()
            {
                System.out.println("Payment done using credit Card.");
            }
        };
        p.pay();
        //SCALA - JAVA 8(Streams,Annotations,lambdas,reflection)
        Payment p1=() -> System.out.println("Cash Payment");
        p1.pay();
    }
}
/*
ℹ️ Points to remember
⭐ One_time implementation
⭐ No need to create separate class
⭐ It is used in events & callback functions
 */
