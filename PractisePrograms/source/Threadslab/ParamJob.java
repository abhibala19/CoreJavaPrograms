package Threadslab;

public class ParamJob implements Runnable {
private int output;
public void run()
{
	output=(int)(Math.random()*100000);
}

public int getOutput()
{
	return output;
}
}
