package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> t=new HashMap<String,String>();
int count=0,count1=0;
System.out.println(t.size());
t.put("rajini","superStar");
t.put("kamal","ulagaNagayan");
t.put("vijay", "ilayathalapathy");
t.put("surya","versatileactor");
System.out.println(t.put("surya","mosttalented"));
System.out.println(t);
System.out.println(t.size());
System.out.println(t.containsKey("kamal"));
System.out.println(t.containsValue("hahss"));
System.out.println(t.remove("rajini"));
System.out.println(t);
Set<Entry<String,String>> entries=t.entrySet();
for(Entry<String,String> en:entries)
{
	System.out.println(en.getKey()+" "+en.getValue());
	if(en.getValue().contains("a"))
	{
		count++;
	}
	if(en.getKey().contains("k"))
	{
		count1++;
	}
}
System.out.println("no of a in the map "+count);
System.out.println("no of k in the keys map "+count1);
Map<String,Integer> r=new TreeMap<String,Integer>();
r.put("one",1);
r.put("two",2);
System.out.println(r);
String s="jil jil and jack went up the hill";
String[] a=s.split(" ");
//for(String word:a)
//{
//	int count2=0;
//	for(String w:a)
//	{
//		if(w.equals(word))
//		{
//			count2++;
//			
//		}
//			
//	}
//	System.out.println(word+" occurs "+count2+" times");

//}
List<String> sr=Arrays.asList(a);
for(String g:a)
{
	System.out.println(g +" occurs "+	Collections.frequency(sr,g)+ " times");

}
Map<String,Integer> wordCount=new HashMap<String,Integer>();
for(String w:a)
{
	Integer occ=wordCount.get(w);
	if(occ==null)
		wordCount.put(w,1);
	else
		wordCount.put(w,occ+1);
	
	
}
System.out.println(wordCount);
}
}