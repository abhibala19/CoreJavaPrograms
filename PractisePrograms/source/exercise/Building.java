package exercise;

public class Building {
int squares=81;
	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if(i>6)
				break;
		}
		String s1=new String("amit");
		System.out.println(s1.replace('m','r'));
		System.out.println(s1);
		String s3="arit";
		String s4="arit";
		String s2=s1.replace('m','r');
		System.out.println(s2==s3);
		System.out.println(s3==s4);

		
new Building().go();
		
	}
	void go()
	{
		incr(++squares);
		System.out.println(squares);
	}
	void incr(int n)
	{
		squares +=10;
	}
}
