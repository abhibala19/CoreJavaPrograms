package Threadslab;

public class CountJob implements Runnable {
 private Counter counter;
public CountJob(Counter counter)
{
	if(counter==null)
		throw new IllegalArgumentException("create counter object");
	else
		this.counter=counter;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
int n=counter.inc_count();
System.out.println(Thread.currentThread().getName()+" the count is "+n);
	}

}
