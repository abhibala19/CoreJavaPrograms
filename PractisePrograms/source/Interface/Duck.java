package Interface;

public class Duck {
static int count=0;
String size;
public Duck(int n)
{
	
	if(n==Constants.SMALL )
	{
		size="small";
		count++;
	}
	if(n==Constants.BIGGER )
	{
		size="big";
		count++;
	}
	if(n==Constants.BIGGEST )
	{
		size="biggest";
		count++;
	}
	
	if(n!=Constants.SMALL && n!=Constants.BIGGER && n!=Constants.BIGGEST)
	{
		System.out.println("give a valid size 5 or 10 or 15");
	}
}
public void swim()
{
	
	if(size=="small")
	{
		System.out.println("i can swim slowly");
	}
	if(size=="biggest")
	{
		System.out.println("i can swim  very faster");
	}
	if(size=="big")
	{
		System.out.println("i can swim faster");
	}
}
}