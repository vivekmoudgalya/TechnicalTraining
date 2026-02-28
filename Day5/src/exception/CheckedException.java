package exception;
import java.io.IOException;
/* Java.io.Exception -> fully qualified className
   for checked exceptions we always use try-catch block
   the throws keyword dosen't handle the exception
   it only passes on te information to the calling method
   the calling method has to handle the exception using try-catch
   the throes keyword is written in the method signature(name)
*/
public class CheckedException
{
    static void readFile()throws IOException
    {
        throw new IOException("file not found");
    }
    public static void main(String[] args)
    {
        try
        {
            display();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void display() throws IOException
    {
        readFile();
    }
}