package Stringlab1;

import CoreJavaPrograms.PractisePrograms.source.exprblm.UniqueArray;

public class CompressString {
	public static void main(String[] args) {
		String s = "1111eeeee222fffhhh341q3";
		String s1 = doCompress(s);
		System.out.println(s1);

	}

	public static String doCompress(String s)
	{
		StringBuilder sd=new StringBuilder("");
		String withoutDuplicate=StringWithoutRepeatation.removeDuplicate(s);
		for(int i=0;i<withoutDuplicate.length();i++)
		{
			char c=withoutDuplicate.charAt(i);
			String d=String.valueOf(c);
			int n=Occurance.numOfOccurance(s, d);
			sd.append(d);
			sd.append(n);
		}
		String g=sd.toString();
		return g;
	}

	
}
