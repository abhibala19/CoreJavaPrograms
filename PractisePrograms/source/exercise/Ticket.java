package exercise;

public class Ticket {
	/*
	 * pseudo code
	 * length * 2 = daily fair = 12
	 * monthly fair = 25
	 * noOfTravellingDays = counter
	 * {1,5, 7, 8, 10, 11, 15, 22}
	 * 4, 2, 1, 2, 1, 4, 7
	 */
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,8,15,24};
	int n=findMinimumPair(a);
	System.out.println(n);
}
public static int findMinimumPair(int[] a)
{
	int days=0;
	int week=0;
	int count=0,count1=0;
	if(a.length>22)
		return 25;
	for(int i=0;i<a.length;i++)
	{
		int j=0;
		int diff=0;
		if(i==a.length-1)
			diff=a[a.length-2]-a[a.length-1];
		else
			diff=a[i+1]-a[i];
		if(diff<3)
		{
			count++;
			if(count==1)
			{
			count1=i;
			j=i;
			}
			count1++;
			if((count>=3 || (count>=3 && count<=7) )&& count1==j+count)
			{
				week=week+7;
			count=0;
			count1=0;
			}
		}
		if(diff>=3)
			days=days+2;
		
	}
	return days+week;
}
}
