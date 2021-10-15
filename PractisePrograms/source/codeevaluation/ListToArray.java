package codeevaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListToArray {
	public static void main(String[] args) {
		int[] a= {1,4,6,1,6,8};
//		int[] t=findUniqueArray(a);
//		for(int f:t)
//		{
//			System.out.println(f);
//		}
		int num=31;
		String s=String.valueOf(num);
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		int i=Integer.parseInt(sb.toString());
		int count=1,r=0,sum=0,pow=0;
		while(i>0)
		{
		r=i%10;
		pow=(int)(Math.pow((int)r,(int)count));
		sum=sum+pow;
		count++;
		i=i/10;

		}

System.out.println(sum);


	}
	public static int[] findUniqueArray(int[] a) {
Set<Integer> l = new LinkedHashSet<Integer>();
for(int g:a)
{
	l.add(g);
}
			List<Integer> s=new ArrayList<Integer>(l);
			Object[] o=s.toArray();
			int[] g=new int[s.size()];
			System.out.println(l);
			int count=0;
			for(Object r:o)
			{
				if(r instanceof Integer)
				{
					g[count++]=(Integer)r;
				}
			}
			return g;
		}
	}

