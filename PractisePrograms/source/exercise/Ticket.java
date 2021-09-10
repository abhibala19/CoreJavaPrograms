package exercise;

public class Ticket {
public static void main(String[] args) {
	int[] a= {1,3,4,5,8,15}
	int n=findMinimumPair(a);
}
public static int findMinimumPair(int[] a)
{
	int days=0;
	int week=0
	int count=0;
	if(a.length>22)
		return 25;
	for(int i=0;i<a.length;i++)
	{
		int diff=0;
		if(i==a.length-1)
			diff=a[a.length-2]-a[a.length-1];
		else
			diff=a[i+1]-a[i];
		if(diff<3)
		{
			count++;
			continue;
		}
		if(diff>=3)
			days=days*2;
	}
	if(count>3)
	{
		if()
	}
}
}
