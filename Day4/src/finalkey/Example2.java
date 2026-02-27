package finalkey;

public class Example2
{
    //if we don't initialize a final variable,
    //where is it initialized?=Constructor
    final int x;

    //if we don't initialize a final variable,
    //where is it initialized?=
    static final int y;
    Example2()
    {
        x=200;
    }
    public static void main(String[] args) {

    }
    static
    {
        y=10;
        System.out.println("ABCC");
        System.out.println("WERT");
        System.out.println("HTET");

    }
}
