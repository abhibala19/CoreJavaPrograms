package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringOcuurence {
	public static void main(String[] args) {
		String s="aaassdd";
		System.out.println(compressString(s));
	}
	public static String compressString(String s) {
		String[] a=s.split("");
		List<String> l=new ArrayList<String>();
		for(String d:a)
		{
		l.add(d);
		}
		Set<String> t=new LinkedHashSet<String>();
		for(String f:a)
		{
		t.add(f);
		}
		ArrayList<String> b=new ArrayList<String>(t);
		
		System.out.println(b);
		StringBuilder sb=new StringBuilder("");
		for(String m:b)
		{
		int n=Collections.frequency(l,m);
		sb.append(m+n);
		}
		String e=sb.toString();
		if(e.length()>=s.length())
		return s;
		else
		return e;
		}
}
