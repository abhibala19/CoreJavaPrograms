package Threadslab;

public class TestParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
ParamJob job1=new ParamJob();
Thread t1=new Thread(job1);
t1.start();
t1.join();
System.out.println(job1.getOutput());
System.out.println("main ends");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
