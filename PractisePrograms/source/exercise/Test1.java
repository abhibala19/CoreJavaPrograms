package exercise;

public class Test1 {
public static void main(String[] args) {
	A5 a=new B5();
	a.foo();	
//	int i=-1; int j=7;
//	do
//	{
//		i++;
//		if(j--<i++)
//		{
//			break;
//		}
//	}while(i<5);
//	System.out.println(i+ " "+j);
//
	
}
}
class A5 
{
	public void foo() throws NullPointerException
	{
	throw new NullPointerException("in class a");
	}
}
class B5 extends A5

{
public void foo()
{
	System.out.println("sss");
}
}
