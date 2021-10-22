package innerclass;

public class StaticLevel {
	private static int x=10;
	public static class Inner
	{
		int y=20;
		public void print()
		{
			System.out.println("x=x"+x+" y= "+y);
		}
	}
	public void useInner()
	{
		Inner in=new Inner();
		in.print();
	}

}
