package recursion;

public class Sum {
	public static void main(String[] args) {
		System.out.println(findSum(10));
		int[] a= {1,2,3,4};
		System.out.println(doMultiply(a));
	}
	public static int findSum(int n)
	{
		if(n==1)
			return 1;
		return n+findSum(n-1);
		
	}
	public static int doMultiply(int[] n)
	{
		if(n.length==1)
			return n[0];
		int val1=n[0];
		int[] a=new int[n.length-1];
		for(int i=1;i<n.length;i++)
		{
			a[i-1]=n[i];
		}
		return  val1*doMultiply(a);
	}

}
