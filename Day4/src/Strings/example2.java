package Strings;
//String is immutable - we cannot change it
//we can just create copies - original string doesn't change
//the concat() method creates a new object - so result is ignored

public class example2
{
    public static void main(String[] args)
    {
        String s="Java";
        s.concat("Program");
        System.out.println(s);
    }
}
