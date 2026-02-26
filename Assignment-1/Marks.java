//Write a program that takes a student's marks as input and prints the corresponding grade (A, B, C, D, or F) using a switch statement.
package Assignment1;

import java.util.*;
public class Marks 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		System.out.println("Enter the marks:");
		int m=sc.nextInt();
		switch(ch)
		{
		case 1:
			if(m<=100 && m>85)
			{
				System.out.println("Grade A");
			}
			break;
		case 2:
			if(m<=85 && m>70)
			{
				System.out.println("Grade B");
			}
			break;
		case 3:
			if(m<=70 && m>55)
			{
				System.out.println("Grade C");
			}
			break;
		case 4:
			if(m<=55 && m>40)
			{
				System.out.println("Grade D");
			}
			break;
		case 5:
			if(m<=40 && m>=0)
			{
				System.out.println("Grade F");
			}
		default:
			System.out.println("Invalid choice");
		}
		sc.close();
	}
}
