package Collection2;

import java.util.ArrayList;
import java.util.Collections;

public class SortSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String s="I am a liitle boy i want to be a superStar";
		String s1=doSorting(s);
		System.out.println(s1);
			}
			public static String doSorting(String s)
			{
				if(s==null || s.trim().equals(""))
					throw new IllegalArgumentException("give valid String ");
				ArrayList a=new ArrayList();
				String b[]=s.split(" ");
				for(String r:b)
				{
					a.add(r);
				}
				Collections.sort(a);
				return a.toString();
				
	}

}
