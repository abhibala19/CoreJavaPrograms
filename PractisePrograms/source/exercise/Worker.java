package exercise;

public class Worker {
String name="hindu";
	public void work() {
		System.out.println("i am worker "+name+"  doing work");
	}
}
class Contractor extends Worker
{@Override
public void work() {
System.out.println("working time strats");
	// TODO Auto-generated method stub
	super.work();
	System.out.println("working tome ends");
}
	
}

