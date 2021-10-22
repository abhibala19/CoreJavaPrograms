package innerclass;

public class MethodLocal {
public int x=10;
public void useInner()
{
	int y=20;
	class Inner
	{
		int z=30;
		public void print()
		{
			System.out.println("x= "+x+" y="+y+" z= "+z);
		}
		
	}
	Inner in=new Inner();
	in.print();
}

}
