package Interface;

public class B {
 static String name="B";
public B(String s)
{
	System.out.println("in class b para contsr");
	name=s;
}
public static void print()
{
	System.out.println("in B "+name);
}
}
class C extends B
{
	 static String name="C";
	public static void print()
	{
		System.out.println("in c "+name);
	}
	public C(String  s)
	{
		super(s);
		name=s;
		System.out.println("in class c para contsr");

	}
}
