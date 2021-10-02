package Thread;

public class Earthjob extends Thread{
	@Override
	public void run() {
	Earth e=Earth.getInstance();
	System.out.println(e);
	}
	public static void main(String[] args) {
		for(int i=0;i<1000;i++)
		{
			new Earthjob().start();
		}
	}

}
