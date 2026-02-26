package super_keyword;

class Parent1
{
	Parent1()
	{
		System.out.println("Parent");
	}
}
public class Child1 extends Parent
{
	Child1()
	{
		super();
		System.out.println("Child1");
	}
	public static void main(String[] args)
	{
		Child1 ch=new Child1();
	}
}