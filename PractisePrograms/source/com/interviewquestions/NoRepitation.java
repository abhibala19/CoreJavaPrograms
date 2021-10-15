package com.interviewquestions;

import java.util.Set;
import java.util.TreeSet;

public class NoRepitation {
	public static void main(String[] args) {
		
	
	String s="is is sis a boy and girl jdkjkl";
	System.out.println(findUnique(s));
	

}
	public static String findUnique(String s)
	{
		Set<String> s1=new TreeSet<String>();
		Set<String> s2=new TreeSet<String>();
		String[] a=s.split(" ");
		for(String f:a)
		{
			if(s1.add(f)==false)
				s2.add(f);
		}
s1.removeAll(s2);
return s1.toString();
	}


}
