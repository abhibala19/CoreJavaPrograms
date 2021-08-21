package CoreJavaPrograms.PractisePrograms.source.exprblm;

public class SeperateOddEvenArray {
	public static void main(String[] args) {
		int[] a= {10,11,23,40,89};
		int[] b=findEvenArray(a);
		int[] c=findOddArray(a);
	
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			System.out.print(b[i]+",");
			
		}
		System.out.println();
		for(int j=0;j<c.length;j++)
		{
			if(c[j]!=0)
			System.out.print(c[j]+",");
			
		}
	}
	public static int[] findEvenArray(int[] r)
	{
		int count1=0;
		int[] even=new int[r.length];
		for(int i=0;i<r.length;i++)
		{
			if((r[i]%2)==0)
			{		even[count1++]=r[i];
			}
		}
		return even;
	}
	public static int[] findOddArray(int[] r)
	{
		int count1=0;
		int[] odd=new int[r.length];
		for(int i=0;i<r.length;i++)
		{
			if((r[i]%2)!=0)
			{
				odd[count1++]=r[i];
			}
		}
		return odd;
	}
}
