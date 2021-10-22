package innerclass;


public class TestMethodLocal {
public static void main(String[] args) {
	MethodLocal m=new MethodLocal();
	m.useInner();
	new Thread()
	{
		public void run()
		{
			System.out.println("in new thread of execution");
			System.out.println(Thread.currentThread().getName());
		}
		
	}.start();
	Thread t=new Thread(new Runnable() 
		
			
			{
		int c=12;
				public void run()
				{
					System.out.println(Thread.currentThread().getName()+c);
				}
			}
			
			);
	t.start();
}
}
