package Threadslab;

public class Counter {
private int count;
public synchronized int inc_count()
{
	 return count++;
	
}
}
