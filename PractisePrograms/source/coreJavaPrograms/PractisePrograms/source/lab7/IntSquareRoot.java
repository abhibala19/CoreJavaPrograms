package coreJavaPrograms.PractisePrograms.source.lab7;

public class IntSquareRoot {
	public static void main(String[] args) {
		boolean b=isIntSquareRoot(25);
		System.out.println("is the given number int square root "+b);
	}
	public static boolean isIntSquareRoot(int num)
	{
		double a=(double)num;
        double d=Math.sqrt(a);
		if((d*d)==num)
          return true;
		else
			return false;
	}

}
