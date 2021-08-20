package CoreJavaPrograms.PractisePrograms.source.lab6;

public class Math1 {
	public static void main(String[] args)
	{
		long l=add(87,67);
		String s=add(4.5,8.7);
		Complex a1=new Complex(5,7);
		Complex a2=new Complex(3,6);
		Complex a3=add(a1,a2);
		System.out.println(l);
		System.out.println(s);
		System.out.println("real = "+a3.getReal()+" imaginary = "+a3.getImaginary());
	}
	public static long add(int a,int b)
	{
		long f=(long)a+b;
		return f;
	}
	public static String add(double d1,double d2) {
		String str=String.valueOf(d1+d2);
		return str;
	}
	public static Complex add(Complex c1,Complex c2) {
		Complex c3=new Complex(c1.getReal()+c2.getReal(),c1.getImaginary()+c2.getImaginary());
		return c3;
	}

}
	