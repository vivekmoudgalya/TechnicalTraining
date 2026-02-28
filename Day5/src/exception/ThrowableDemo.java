package exception;

import java.sql.SQLOutput;

public class ThrowableDemo {
    static void test() throws Throwable{
        throw new Throwable("Somethin went Wrong");
    }
    public static void main(String[] args) {
        try
        {
            test();
        }catch (Throwable t){
            //fully qualified name + message
            System.out.println("Handled:"+t);
            //only the message
            System.out.println("Handled:"+t.getMessage());
        }
    }
}
/* throw new String("Error");        ❌
throw new Integer("Error");          ❌
throw new Throwable("Error")         ✅
throw new Exception("Error")         ✅
throw new RunTimeException("Error")  ✅
throw new IOException("Error")       ✅
*/
