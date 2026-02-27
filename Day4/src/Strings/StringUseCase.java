package Strings;

public class StringUseCase
{
    public static void main(String[] args)
    {
        String message="Order Confirmed";
        message=message+" -ID: 101";
        System.out.println(message);
        //message=message+" -ID: 102";
        //System.out.println(message);
    }
}
/* String is immutable
   Stored in SCP (String Constant Pool)
   Every modification creates  new object
   good for read only data
*/
