package Strings;

public class BufferExample
{
    public void stringInsert()
    {
        StringBuffer buffer=new StringBuffer("JA");
        System.out.println("Old String:"+buffer);
        buffer.insert(1,"AV");//JAVA
        System.out.println("New String:"+buffer);
    }
    public void StringAppend()
    {

        StringBuffer buffer=new StringBuffer("SCE");
        System.out.println("Old String:"+buffer);
        buffer.append(" ISE");
        System.out.println("New String:"+buffer);
    }
    public void StringReverse()
    {
        StringBuffer buffer=new StringBuffer("NOHTYP");
        System.out.println("Old String:"+buffer);
        buffer.reverse();
        System.out.println("New String:"+buffer);
    }
    public static void main(String[] args)
    {
        new BufferExample().stringInsert();
        new BufferExample().StringAppend();
        new BufferExample().StringReverse();
    }
}
