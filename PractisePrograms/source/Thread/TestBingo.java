package Thread;

public class TestBingo {
public static void main(String[] args) {
	BingoThread job=new BingoThread();
	job.setName("thread1");
	job.start();
	for (int i=0;i<100;i++)
	{
		System.out.println("bongo"+" " +i);
	}
	System.out.println("main thread ends");
}
}
