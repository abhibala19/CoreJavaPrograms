package exception;

public class TestEx {
public static void main(String[] args) {
	try
	{
		m1();
	}
	catch(Throwable e)
	{
		e.printStackTrace();
	}
}
public static void m1()
{
	System.out.println("in method m1");
	m2();
}
public static void m2()
{
	System.out.println("in method m2");
	Animal a=new Animal();
	m3(a);
	Pig p=new Pig();
	m3(p);
}
public static void m3(Animal a)
{
	System.out.println("in m3");
	Animal p=a;
}
}
