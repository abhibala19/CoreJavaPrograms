package Thread;

public class TestPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		PrimeNumJob job1=new PrimeNumJob(10000);
		PrimeNumJob job2=new PrimeNumJob(100);
		Thread t1=new Thread(job1);
		Thread t2=new Thread(job2);
		t1.start();
		t2.start();
		t1.setName("first");
		t2.setName("second");
		t1.join();
		t2.join();
		System.out.println(t1.getState().toString());
		System.out.println(t2.getState().toString());
		System.out.println(job1.getPrimeNum());
		System.out.println(job2.getPrimeNum());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
