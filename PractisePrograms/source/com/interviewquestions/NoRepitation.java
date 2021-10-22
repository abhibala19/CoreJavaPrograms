package com.interviewquestions;

import java.util.Set;
import java.util.TreeSet;

public class NoRepitation {
	public static void main(String[] args) {
		
	
	String s="is is sis a boy and girl jdkjkl";
	System.out.println(removeDuplicates(s));
	

}
	public static String removeDuplicates(String s)
	{
		Set<String> s1=new TreeSet<String>();
		String[] a=s.split(" ");
		for(String f:a)
		{
			s1.add(f);
		}
return s1.toString();
	}


}
