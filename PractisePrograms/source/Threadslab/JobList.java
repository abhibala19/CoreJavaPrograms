package Threadslab;

import java.math.BigDecimal;
import java.util.List;

public class JobList implements Runnable {
private List<Integer> l;
private BigDecimal sum;
private BigDecimal output;
public JobList(List l) {
	// TODO Auto-generated constructor stub
	if(l==null)
		throw new IllegalArgumentException("list is empty");
	else
		this.l=l;
}@Override
	public void run() {
		// TODO Auto-generated method stub
	double avg=0;
	sum = BigDecimal.ZERO;
	output = BigDecimal.ZERO;
//	System.out.println(l);
	for(int i:l)
	{
		System.out.println(i);
		sum = sum.add(new BigDecimal(i));
		
	}
	avg=sum.intValue()/l.size();
	output = output.add(new BigDecimal(avg));
	
	}
public BigDecimal getOutput()
{
	return output;
}
}
