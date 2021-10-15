package recursion;

public class SumOfArray{
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int l=doSumOfArray(a);
		System.out.println(l);
	}
	public static int doSumOfArray(int[] a)
	{
		if(a.length==1)
			return a[0];
		int val1=a[0];
		int[] d=new int[a.length-1];
		for(int i=1;i<a.length;i++)
			d[i-1]=a[i];
		return val1+doSumOfArray(d);
		
	}

}
