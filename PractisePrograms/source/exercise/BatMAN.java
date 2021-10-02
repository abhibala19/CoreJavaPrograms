package exercise;

public class BatMAN {
	public int squ=81;
	public static void main(String[] args) {
		new BatMAN().go();
		int x=0;
		int y=10;
		do
		{
			y--;
			++x;
		}while(x<=5);
		System.out.println(x+" "+y);
		}
		
	
	public void go()
	{
		incr(++squ);
		System.out.println(squ);
	}
	public void incr(int s)
	{
		squ=squ+10;
	}
}
	
