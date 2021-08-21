package CoreJavaPrograms.PractisePrograms.source.exprblm;

public class UniqueArray {
	public static void main(String[] args) {
		int[] a = { 12, 2, 2, 4, 5, 5 };
		int[] b = { 2, 5, 6 };
//		int[] d=findUniqueElementsWithTwoArray(a,b);
		findUniqueWithOneArray(a);
	}

//	public static int[] removeDuplicate(int[] a)
//	{
//		count=0;
//		for(int i=0;i<a.length;i++)
//		{
//			
//			
//			
//		}
//
//	}
//	public static int[] findUniqueElementsWithTwoArray(int[] x,int[] y)
//	{
//		int count1=0;
//		int d=(x.length>y.length?x.length:y.length);
//		int[] unique=new int[d];
//		for(int i=0;i<x.length;i++)
//		{
//			for(int j=0;j<y.length;j++)
//			{
//				if(x[i]==y[j])
//				{
//					unique[count1++]=x[i];
//				}
//			}
//		}
//		return unique;
//	}
	public static void findUniqueWithOneArray(int[] x) {
		int count1 = 0;

		for (int i = 0; i < x.length; i++) {

			for (int j = 0; j < x.length; j++) {
					if (x[i] == x[j])
					{

						count1++;
						System.out.println(x[i]);
						break;
					}
				}

			}
			count1 = 0;
		}
	}

}
