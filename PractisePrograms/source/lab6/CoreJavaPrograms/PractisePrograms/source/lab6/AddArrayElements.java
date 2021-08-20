package CoreJavaPrograms.PractisePrograms.source.lab6;

public class AddArrayElements {
	public static void main(String[] args) {
		int[] i= {10,20,30,40,50,70,40};
	   int d=doAddingOfArrayElements(i);
	   System.out.println("the sum is "+d);
	}
	public static int doAddingOfArrayElements(int[] n) {
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		return sum;
	}

}
