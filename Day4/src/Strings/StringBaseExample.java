package Strings;

public class StringBaseExample
{
    public static void main(String[] args)
    {
        char[] letters={'T','I','G','E','R'};
        //String name=letters.toString();//wrapper classes
        String name=new String(letters);
        System.out.println(name);
        String jumbled="Tiger1Is1From1ISE1B1Section";
        //{"Tiger","Is","From","ISE","B","Section"}
        String[] words=jumbled.split("1");
        System.out.println(words[5]);
        for(Object o: words)
        {
            System.out.print(o +" ");
        }
    }
}
