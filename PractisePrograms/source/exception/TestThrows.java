package exception;

public class TestThrows {
public static void main(String[] args) {
	try
	{
		System.out.println("going to use throws");
		if(1==1)
		throw new MyException("this is my exception");
		System.out.println("after using throws");
	}
	catch(Exception e)
	{
		System.out.println("in main catch msg "+e.getMessage());
		e.printStackTrace();
	}
}
}
