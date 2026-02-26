package super_keyword;
public class child2 extends Parent
{
	int x=20;
	void show()
	{
		super.print();
		System.out.println(x);
		System.out.println(super.x);
	}
	public static void main(String[] args)
	{
		child2 ob=new child2();
		ob.show();
	}
}
