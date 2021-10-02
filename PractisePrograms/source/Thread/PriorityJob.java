package Thread;

public class PriorityJob implements Runnable{
@Override
public void run() {
for(int i=0;i<50;i++)
	System.out.println(Thread.currentThread().getName()+" "+i+" priority "+Thread.currentThread().getPriority());
}
public static void main(String[] args) {
	PriorityJob job1=new PriorityJob();
	Thread t1=new Thread(job1);
	Thread t2=new Thread(job1);
	t1.setName("number1");
	t2.setName("number2");
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
}
}
