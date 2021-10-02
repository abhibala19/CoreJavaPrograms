package Interface;

public class X {
	static int b=10;
	static
	{
		System.out.println("in static initlizer 1 "+b);
		b=20;
	}
	static
	{
		System.out.println("in static initlizer 2 "+b);
		b=30;
	}
int i=10;
{
	System.out.println("in ints initializer 1 "+i);
	i=20;
}
{
	System.out.println("in ints initializer 2 "+i);
	i=30;
	
}
public X() {
	// TODO Auto-generated constructor stub
	System.out.println("in constr "+i);
	System.out.println("in cons static var r 1 "+b);
	b=70;
	
	i=40;

}
}
class Y extends X
{
	static int c=10;
	static
	{
		System.out.println("in static initlizer 1 Yclass "+c);
		c=20;
	}
	static
	{
		System.out.println("in static initlizer 2 y class"+c);
		c=30;
	}
int j=10;
{
	System.out.println("in ints initializer 1 "+j);
	j=20;
}
{
	System.out.println("in ints initializer 2 "+j);
	j=30;
	
}
public Y() {
	// TODO Auto-generated constructor stub
	System.out.println("in constr "+j);
	System.out.println("in cons static var r 1 "+j);
	c=1000;
	
	j=60;

}
}