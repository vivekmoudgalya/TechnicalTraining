package Strings;

public class MutableStrings
{
    public static void main(String[] args) {
        String s="SCE";
        s+="ISE";
        System.out.println("String:"+s);
        //Mutable - thread safe
        StringBuffer buffer=new StringBuffer("SCE");
        buffer.append(" ISE");
        System.out.println(buffer);
        //mutable - not thread safe
        StringBuilder builder=new StringBuilder("SCE");
        builder.append(" ISE");
        System.out.println(builder);
    }
}
