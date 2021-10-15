package com.interviewquestions;

public class OccuranceOfChar {
public static void main(String[] args) {
	String s="AAsdf";
	findOccurance(s);
}
public static void findOccurance(String s)
{s=s.toLowerCase();
	int[] a=new int[26];
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		a[c-'a']++;
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println((char)(i+97)+" occurs "+a[i] +" times");
	}
}
}
