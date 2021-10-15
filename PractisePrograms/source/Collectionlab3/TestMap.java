package Collectionlab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		
	
Map<String,String> m1=new HashMap<String,String>();
m1.put("navarasanayagan", "karthik");
m1.put("thalpathy","vijay");
m1.put("superStar","rajini");
m1.put("ulagaNagayan","kamal");
System.out.println(m1);
System.out.println(m1.put("superStar","surya"));
System.out.println(m1);
System.out.println(m1.containsKey("superStar"));
System.out.println(m1.containsValue("kamal"));
Set<Entry<String,String>> s=m1.entrySet();
System.out.println(s);
Set t=m1.keySet();
System.out.println(t);
Collection<String> c= m1.values();
System.out.println(c);

	}

}
