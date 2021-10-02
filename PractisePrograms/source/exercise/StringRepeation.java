package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringRepeation {
	public static void main(String[] args) {
		String s="hellow how are U";
		System.out.println(getAsUnique(s));
	}
	
	public static String getAsUnique(String  s)
	{
	String h=s.replace(" ","");
	String e="["+h+"]";
	String[] a=e.split("");
	Set<String> l=new LinkedHashSet<String>();
	for(String d:a)
	{
	l.add(d);
	}
	StringBuilder sb=new StringBuilder("");
	for(String f:l)
	{
	sb.append(f);
	}
	return sb.toString();
	}	
}
