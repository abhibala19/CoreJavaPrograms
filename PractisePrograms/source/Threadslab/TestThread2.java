package Threadslab;

public class TestThread2 {
public static void main(String[] args) {
//	MyJob job1=new MyJob();
//	Thread t1=new Thread(job1);
//	Thread t2=new Thread(job1);
//	t1.setName("aaaa");
//	t2.setName("bbb");
//	t1.start();
//	t2.start();
//	
	MyJob j1=new MyJob(10);
	MyJob j2=new MyJob(1000);
	Thread t3=new Thread(j1);
	Thread t4=new Thread(j2);
	t3.setName("dheeer");
	t4.setName("kavan");
	t3.start();
	t4.start();
	System.out.println("main thread ends");
	
}
}
