package recursion;

public class MaximumIn {
public static void main(String[] args) {
	int[] r= {10,30,40,60};
	int n=findMaximum(r);
	System.out.println(n);
}
public static int findMaximum(int[] n)
{
	if(n.length==1)
		return n[0];
	 int val1=n[0];
	int[] a=new int[n.length-1];
	for(int i=1;i<n.length;i++)
		a[i-1]=n[i];
	int val2=findMaximum(a);
	if(val1>val2)
		return val1;
	else
		return val2;
}
}
