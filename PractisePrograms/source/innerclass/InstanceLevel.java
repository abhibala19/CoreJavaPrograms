package innerclass;

public class InstanceLevel {
	private int x=90;
	public class Inner
	{
		int y=10;
		public void print()
		{
			System.out.println("x= "+x+" y= "+y);
		}
	}
	public void useInner()
	{
		Inner in=new Inner();
		in.print();
	}
	

}
