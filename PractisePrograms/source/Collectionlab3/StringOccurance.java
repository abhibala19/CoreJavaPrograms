package Collectionlab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringOccurance {
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	Scanner sc2=new Scanner(System.in);
	System.out.println("enter sentence");
	String sentence=sc2.nextLine();
	System.out.println("enter the word to search");
	String word=sc1.next();
	List<String> l=new ArrayList<String>();
	String[] a=sentence.split(" ");
	l=Arrays.asList(a);
	int n=Collections.frequency(l, word);
	System.out.println(n);
	Set<String> s=new HashSet<String>(l);
	Collections.sort(l);
	System.out.println(l);
	System.out.println(s);
	StringLengthComparator slc=new StringLengthComparator();
	Set<String> s1=new TreeSet<String>(slc);
	for(String e:a)
	{
		s1.add(e);
	}
	Collections.sort(l,slc);
	System.out.println(s1);
	System.out.println(l);
	
	
	
}
}
