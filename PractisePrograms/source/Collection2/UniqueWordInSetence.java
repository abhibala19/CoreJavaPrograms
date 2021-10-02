package Collection2;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWordInSetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I am a liitle boy i want to be a superStar";
String s1=findUnique(s);
System.out.println(s1);
	}
	public static String findUnique(String s)
	{

		if(s==null || s.trim().equals(""))
			throw new IllegalArgumentException("give valid String ");
		Set a=new TreeSet();
		String b[]=s.split(" ");
		for(String r:b)
		{
			a.add(r);
		}
		return a.toString();
		
	}

}
