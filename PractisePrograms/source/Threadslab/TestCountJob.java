package Threadslab;

public class TestCountJob {
public static void main(String[] args) {
	try
	{
		Counter c=new Counter();
		CountJob job1=new CountJob(c);
		Thread t1=new Thread(job1);
		Thread t2=new Thread(job1);
	
		t1.start();
		t2.start();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
