package exception;

public class TestPerson {
public static void main(String[] args) {
	try
	{
	Person p=new Person("ramu", 59);
	System.out.println(p.getAge());
	System.out.println(p.getName());
	p.dance(args[0]);
	}
	catch (DanceFailureException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
