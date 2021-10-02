package Thread;

public class TestBingoBongo {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	BingoThread job1=new BingoThread();
	job1.setName("abhi");
	job1.start();
//	BingoThread job2=new BingoThread();
//	job1.setName("abbhhhi");
//	job2.start();
	BongoThread job3=new BongoThread();
Thread t1=new Thread(job3);
t1.start();
t1.setName("rere");
System.out.println("main ends");
}

}
