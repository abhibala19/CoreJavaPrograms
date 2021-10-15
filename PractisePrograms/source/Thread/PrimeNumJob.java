package Thread;

public class PrimeNumJob implements Runnable{
private int range;
private long  primeNum;
public PrimeNumJob(int n) {
	// TODO Auto-generated constructor stub
	if(n>0)
		range=n;
	else
		throw new IllegalArgumentException("invalidnum");
}@Override
	public void run() {
		// TODO Auto-generated method stub
	boolean flag=true;
	outer:while(flag)
	{
	int val=(int)(Math.random()*range);
	if(val%2==0)
		continue;
	for(int i=3;i<(int)(Math.sqrt(val));i++)
	{
		if(val%i==0)
			continue outer;
	}
	primeNum=val;
	flag=false;
	}
}
public long getPrimeNum()
{
	return primeNum;
		
		
	}

}
