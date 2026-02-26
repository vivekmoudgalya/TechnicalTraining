package encapsulation;

public class main
{
	public static void main(String[] args)
	{
		Students ob=new Students("Vivek",124);
		System.out.println(ob.getname());
		ob.setname("Moudgalya");
		System.out.println(ob.getname());
	}
}
