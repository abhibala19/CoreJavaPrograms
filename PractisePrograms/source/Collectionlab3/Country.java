package Collectionlab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Country {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();

		Map<String,String> m1;
	Scanner sc1=new Scanner(System.in);
	System.out.println("enter howmany country you are are going to add");
	int n=sc1.nextInt();
	System.out.println(" the number of country you are going to add is "+n);
	while(n!=0)
	{
		System.out.println("enter country name");
		String s1=sc1.next();
		System.out.println("enter capital");
		String s2=sc1.next();
		m.put(s1,s2);
		n--;
	}
	int ch=0;
	String s1="",s2="";
	List<Entry<String,String>> l=new ArrayList<Entry<String,String>>();
	CapitalComparator cc=new CapitalComparator();

	Set<Entry<String,String>> g=new TreeSet<Entry<String,String>>(cc);

	while(ch!=4)
	{
		System.out.println("press 1 to search for the  capital for a given country ");
		System.out.println("press 2 to list country with capital");
		System.out.println("press 3 to sort the list output based on country");
		System.out.println("press 4 to sort the list output based on capital");

		System.out.println("enter your choice");
		 ch=sc1.nextInt();
		 switch(ch)
		 {
		 case 1:
			 System.out.println("searching");
			 System.out.println("enter the country name you want to search");
			 s1=sc1.next();
			 s2=m.get(s1);
			 if(s2==null)
				 System.out.println("you entered wrong country");
			 else
				 System.out.println(s2);
			 break;
		 case 2:
			 System.out.println("list your country with capital");
			 System.out.println(m);
			 break;
		 case 3:
			 System.out.println("sorting");
			 m1=new TreeMap<String,String>(m);
			 System.out.println(m1);
			 break;
		 case  4:
			 System.out.println("sorting by capital");
			 Set<Entry<String,String>> entries=m.entrySet();
			 for(Entry<String,String> h:entries)
			 {
				 g.add(h);
			 }
			 System.out.println(g);
			
			 
			 default:
				 System.out.println("enter choices between 1 to 3");
			 }
			 
		 }
	}
	
	}


