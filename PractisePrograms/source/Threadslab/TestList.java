package Threadslab;

import java.util.ArrayList;

public class TestList {
public static void main(String[] args) {
	try {
	ArrayList a=new ArrayList();
		a.add(23);
		a.add(34);
		a.add(456);
		a.add(356);
		JobList job1=new JobList(a);
		Thread t1=new Thread(job1);
		t1.start();
		t1.join();
		System.out.println(job1.getOutput());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
