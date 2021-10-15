package recursion;

public class Factorial {
public static void main(String[] args) {
	int f=findFactorial(4);
	System.out.println(f);
}
public static int findFactorial(int num)
{
	if(num==0 || num==1)
		return 1;
	return num*findFactorial(num-1);
	
}
}
