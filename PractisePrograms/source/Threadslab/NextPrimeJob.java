package Threadslab;

public class NextPrimeJob implements Runnable {
	private long result;
	private long value;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run");
		boolean flag=true;
		outer:while(flag)
		{
		long val=(long)(Math.random()*value);
		if(val%2==0)
			continue;
		for(int i=3;i<(long)(Math.sqrt(val));i++)
		{
			if(val%i==0)
				continue outer;
		}
		result=val;
		flag=false;
		}
		long t1=System.currentTimeMillis();
		System.out.println(t1);



	}

	public NextPrimeJob(long val) {
		if (val < 0)
			throw new IllegalArgumentException("give positive value");
		else
			this.value = val;
		// TODO Auto-generated constructor stub
	}
	public long getResult()
	{
		return result;
	}
}
