package Collectionlab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OccuranceByMap {
	public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
System.out.println("enterthe sentence");
String s=sc1.nextLine();
String[] a=s.split(" ");
Map<String,Integer> m=new HashMap<String,Integer>();
for(String f:a)
{
Integer occ=m.get(f);
if(occ==null)
{
	m.put(f,1);
}
else
	m.put(f, occ+1);
}
System.out.println(m);
}
	

 
}
