package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E4
{
    public static void main(String[] args) throws IOException {
        BufferedReader br=null;
        String str;
        try{
            br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter any data:");
            str=br.readLine();
            System.out.println(str);
        }catch(Exception e){
            br.close();
        }
    }
}
