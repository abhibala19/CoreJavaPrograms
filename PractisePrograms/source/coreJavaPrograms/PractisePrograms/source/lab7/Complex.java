package coreJavaPrograms.PractisePrograms.source.lab7;

public class Complex {
	 private int real;
	private int imaginary;
	public void setReal(int n) {
		if(n>0) {
			real=n;
		}
		else
			System.out.println("give a valid number");
	}
	public void setImaginary(int num)
	{
		if(num>0) {
			imaginary=num;
		}
		else
			System.out.println("give a valid number");
	}
	public int getReal() {
		return real;
	}
	public int getImaginary()
	{
		return imaginary;
	}
	public Complex(int re,int im)
	{
		real=re;
		imaginary=im;
	}

}
