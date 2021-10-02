package exercise;

import sun.awt.geom.Crossings.EvenOdd;

public class TestMain {
	public static void main(String[] args) {
//		String s1 = "xadxxxxghhxx";
//		int[] c = { 1, 2, 3, 4, 6, 7 };
//		int[] b = copyEvens(c, 3);
//		for (int g : b) {
//			System.out.println(g);
//		}
//
//		String s2 = "x";
//		int n = countX(s1, s2);
//		String s3 = removeX(s1);
//		System.out.println(s3);
//		System.out.println(n);
		int[] g= {1,2,3,4,100};
//	int[] gs=evenOdd(g);
//	for(int f:gs)
//	{
//		System.out.println(f);
//	}
		System.out.println(centeredAverage(g));
	}

	public static int centeredAverage(int[] nums) {
		int sum = 0, avg = 0, max = 0, min = 1;
		int  count=0,countMin = 0,countMax=0;
		boolean maxFlag = true, minFlag = true;
		for (int i = 0; i <nums.length ; i++) {
			if (nums[i] > max ) 
				max = nums[i];
			if(nums[i]<min)
				min=nums[i];
		}
		for (int i =0; i < nums.length-1 ;i++) {
			if (nums[i] == min) { 
				countMin++;
				continue;
			}
			if (nums[i] == max) { 
				countMax++;
				continue;
			}
			boolean flag=true;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j] && nums[i]!=min && nums[i]!=max)
					flag=false;
				
			}
			if(flag) {
				sum = sum + nums[i];
				count++;
			}
			}
		if(countMin>1 ){
			sum=sum+min*(countMin-1);
			count=count+(countMin-1);
	}
	if(countMax>1 ){
			sum=sum+max*(countMax-1);
			count=count+(countMax-1);
	}

		avg=sum/count;
return avg;
	}public static int[] evenOdd(int[] nums) {
		int[] a=new int[nums.length];
		int[] b=new int[nums.length];
		int[] c=new int[nums.length];

		int count1=0,count2=0;
		for(int i=0;i<nums.length;i++)
		{
		if(nums[i]%2==0)
		  a[count1++]=nums[i];
		else
		b[count2++]=nums[i];
		}
		
		for(int i=0;i<count1;i++)
		{
		c[i]=a[i];
		}
		int j=0;
		for(int i=count1;i<count2;i++)
		{
		c[count1++]=b[j];
		j++;
		}
		return c;
	}

	public static int countX(String s1, String s2) {
		int count = 0;
		int pos1 = s1.indexOf("x", 0);
		int pos = pos1;
		int diff = 0;
		while ((pos = s1.indexOf("x", ++pos)) != -1) {
			diff = pos - pos1;
			if (diff == 1) {
				count++;
			}
			pos1 = pos;

		}
		return count;
	}

	public static String removeX(String str) {
		if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) != 'x') {
			return str.substring(1, str.length());

		}

		if (str.charAt(str.length() - 1) == 'x' && str.charAt(0) != 'x') {
			return str.substring(0, str.length() - 1);

		}
		if (str.charAt(str.length() - 1) == 'x' && str.charAt(0) == 'x') {
			return str.substring(1, str.length() - 1);

		} else
			return str;

	}

	public static int[] copyEvens(int[] nums, int count) {
		int[] n = new int[count];
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] / 2) == 0 && temp <= count)
				n[temp++] = nums[i];
		}
		return n;

	}
}