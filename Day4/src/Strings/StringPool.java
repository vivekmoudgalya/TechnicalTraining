package Strings;


public class StringPool
{
    public static void main(String[] args)
    {
        String s1="Java";
        String s2="Java";
        System.out.println(s1==s2);//checks values

        String s3=new String("Java");
        System.out.println(s1==s3);//checks references/objects
        System.out.println(s1.equals(s3));//checks values
    }
}
/* s1 & s2 share same objects in pool
   new String() creates new heap object
   == compares references
   .equals() compares values
*/