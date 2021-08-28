package Stringlab1;

public class Math1 {
	public static void main(String[] args)
	{
		int[] l1= {23,5,3,5,6};
		double[] d= {4.5,7.8,8.9};
		long g=add(56,78);
		long l=add(l1);
		String s=add(d);
		Complex a1=new Complex(5,7);
		Complex a2=new Complex(3,6);
		Complex a3=add(a1,a2);
		System.out.println(l);
		System.out.println(g);
		System.out.println(s);
		System.out.println("real = "+a3.getReal()+" imaginary = "+a3.getImaginary());
	}
	public static long add(int a,int b)
	{
		long f=(long)a+b;
		return f;
	}
	public static long add(int[] a)
	{
		long sum=0;
		for(int i=0;i<a.length;i++)
			{
			sum=sum+a[i];
			}
		return sum;
	}
	public static String add(double[] d1) {
		double sum=0;
		for(int i=0;i<d1.length;i++)
		{
			sum=sum+d1[i];
		}
		String str=String.valueOf(sum);
		return str;
	}
	public static Complex add(Complex c1,Complex c2) {
		Complex c3=new Complex(c1.getReal()+c2.getReal(),c1.getImaginary()+c2.getImaginary());
		return c3;
	}

}
	