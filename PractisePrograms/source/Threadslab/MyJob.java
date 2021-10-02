package Threadslab;

public class MyJob implements Runnable {
	private int val;
	public MyJob(int num)
	{
		if(num>0)
			this.val=num;
		else
			throw new IllegalArgumentException("num is negative");
	}
@Override
public void run() {
	// TODO Auto-generated method stub
try {
	for(int i=val;i<val+100;i++)
	{
		System.out.println(i+Thread.currentThread().getName());
		Thread.sleep(500);
		
	}
}
catch(InterruptedException e)
{
	e.printStackTrace();
}
}
}
