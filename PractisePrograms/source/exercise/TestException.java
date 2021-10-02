package exercise;

public class TestException {
public void m1() throws Throwable
{
	throw new NullPointerException("ggf");
}
public static void main(String[] args) {
	GR t=new GR();
	t.m1();
}	
}
class GR extends TestException
{@Override
public void m1() throws Error {
	// TODO Auto-generated method stub
	System.out.println("in b");
}
	
}
