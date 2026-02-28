package exception;

public class E1
{
    public static void main(String[] args)
    {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try
        {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");
        }
        catch (Exception e){
            System.out.println("something unexpected happened");
        }
        //releases the resource held by OS
        finally {
            System.out.println("Start Execution");
            System.out.println("Turn OFF Load DB");
            System.out.println("Turn OFF Load Interest");
            System.out.println("TURN OFF Load Files");
            System.out.println("TURN OFF Load Docker-Kubernetes");
        }
        System.out.println("value of K is:" + k);
    }
    static
    {
        System.out.println("Start Execution");
        System.out.println("Load DB");
        System.out.println("Load Interest");
        System.out.println("Load Files");
        System.out.println("Load Docker-Kubernetes");
    }
}