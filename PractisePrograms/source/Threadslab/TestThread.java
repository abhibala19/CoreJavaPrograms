package Threadslab;

public class TestThread {
public static void main(String[] args) {
	System.out.println("main thread starts");
	PrintThread t=new PrintThread();
	t.setName("ramu");
	t.setPriority(1);
//	t.run();
	t.start();
	PrintThread t2=new PrintThread();
	
	t2.start();
	t2.setPriority(10);
	t2.setName("balu");
	System.out.println("main thread ends");
}
}
