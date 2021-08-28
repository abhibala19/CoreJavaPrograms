package coreJavaPrograms.PractisePrograms.source.lab7;

public class UseOfInitializer {
	static int x=10;
	static
	{
		System.out.println(" in static ini "+x);
		x=30;
	}
	{
		System.out.println("int instance initializer "+x);
		x=50;
	}
	public UseOfInitializer()
	{
		System.out.println("in no arg constructor "+x);
		x=67;
	}
	public UseOfInitializer(int n)
	{
		System.out.println("in parameterized constructor "+x);
	}

}

