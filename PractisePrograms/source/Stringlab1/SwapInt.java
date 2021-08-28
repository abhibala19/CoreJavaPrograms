package Stringlab1;

public class SwapInt {
	public static void main(String[] args) {
		int a=10,b=20;
		swapByUsingTemp(a, b);
		swapByAddAndSub(a,b);
		swapByExOR(a,b);
	}
	public static void swapByUsingTemp(int a,int b)
	{
		int temp=a;
		a=b;
		b=temp;
		System.out.println("afeter swapping "+a+" "+b);
	}
	public static void swapByAddAndSub(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("afeter swapping "+a+" "+b);
	}
	public static void swapByExOR(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("afeter swapping "+a+" "+b);
	}

}
