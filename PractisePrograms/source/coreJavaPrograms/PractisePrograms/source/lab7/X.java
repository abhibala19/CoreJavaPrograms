package coreJavaPrograms.PractisePrograms.source.lab7;

public class X{
	public static void main(String[] args) {
		  test(98L);
		  test(5.5f);
		  short s=5;
		  test(s);
		  byte b=67;
		  test(b);
		  long l=89;
		  test(l);
	}
	public static void test(int n)
	{
		System.out.println("in integer test method "+n);
	}
	public static void test(double d) {
		System.out.println("in double test method "+d);
	}
	public static void test(short f) {
		System.out.println("in short test method "+f);
	}
	public static void test(byte c) {
		System.out.println("in byte test method "+c);
	}
	public static void test(long h)
	{
		System.out.println("in long testmehod "+h);
	}

}
