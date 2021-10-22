package com.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfWord {
public static void main(String[] args) {
	String s="ask ask jug mug jug mug mug";
	Map<String,Integer> m=findOccuranceOfWords(s);
	System.out.println(m);
	
}
public static Map findOccuranceOfWords(String s)
{
	String[] a=s.split(" ");
	Map<String,Integer> m=new HashMap<String,Integer>();
	for(String f:a)
	{
		Integer cc=m.get(f);
		if(cc==null)
		{
			m.put(f, 1);
		}
		else
			m.put(f, cc+1);
		
	}
	return m;
}
}
