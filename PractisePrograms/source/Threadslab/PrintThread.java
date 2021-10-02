package Threadslab;

public class PrintThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + " " + getName());
   String s=null;
   System.out.println(s.length());
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
