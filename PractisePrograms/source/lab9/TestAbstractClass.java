package lab9;

public abstract class TestAbstractClass {
//public static abstract void getSomething()
//{
//	System.out.println("in static method ofabstract class");
//}
	
}
abstract class A1 extends TestAbstractClass
{
	
}
abstract class A2 extends A
{
	public A2() {
		// TODO Auto-generated constructor stub
	}
	public final void doSomething()
	{
		System.out.println(" i can have final method in abstract class");
	}
//	private abstract void doSomething();
}
//final class B 
//{
//	public abstract void use();
//}
