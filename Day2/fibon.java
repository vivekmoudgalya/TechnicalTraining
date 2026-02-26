package problems;

public class fibon
{
	public void fibonacci(int n)
	{
		int a=0,b=1,sum=0;
		System.out.println("Fibonacci Series:");
		for(int i=0;i<=n;i++)
		{
			System.out.print(a+" ");
			sum=a+b;
			a=b;
			b=sum;
		}
	}
	public static void main(String[] args)
	{
		fibon f=new fibon();
		f.fibonacci(8);
	}
}