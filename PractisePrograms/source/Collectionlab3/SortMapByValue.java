package Collectionlab3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class SortMapByValue {
public static void main(String[] args) {
	Map<String,Integer> m=new HashMap<String,Integer>();
	m.put("one",1);
	m.put("five",5);
	m.put("four",4);
	m.put("three",3);
	m.put("two",2);
System.out.println(m);
ValueComparator vc=new ValueComparator();
Set<Entry<String,Integer>> t=m.entrySet();
Set<Entry<String,Integer>> d=new TreeSet<Entry<String,Integer>>(vc);
for(Entry<String,Integer> v:t)
{
	d.add(v);
}
System.out.println(d);
Map<String,Integer> m1=new LinkedHashMap<String,Integer>();
for(Entry<String,Integer> g:d)
{
	m1.put(g.getKey(),g.getValue());
}
System.out.println(m1);

 }
}
