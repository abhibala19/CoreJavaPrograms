package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class NonRepeatingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="this is what will happen in this is what market";
String s1=findNonRepeatingWord(s);
System.out.println(s1);
	}
	public static String findNonRepeatingWord(String s)
	{
		if(s==null || s.trim().equals(""))
			throw new IllegalArgumentException("give valid String ");
		String[] a=s.split(" ");
		ArrayList a1=new ArrayList();
		TreeSet t=new TreeSet();
		for(String d:a)
		{
			a1.add(d);
			t.add(d);
		}
		Collections.sort(a1);
//		System.out.println(a1);
//		System.out.println(t);
		ArrayList<String> a2=new ArrayList<String>();
		for(String r:a)
		{
			if(Collections.frequency(a1, r)==1)
			{
				a2.add(r);
			}
		}
		
		return a2.toString();
	}
	

}
