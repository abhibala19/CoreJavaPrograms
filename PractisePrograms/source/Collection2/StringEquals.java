package Collection2;

import java.util.HashSet;
import java.util.TreeSet;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="asdf";
String s2=new String("asdf");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
HashSet s=new HashSet();
System.out.println(s.add(s1));
System.out.println(s.add(s2));
TreeSet t=new TreeSet();
System.out.println(t.add("rammaya"));
System.out.println(t.add(s1));
System.out.println(t.add("ramanuja"));
System.out.println(t.add("ramaeheshwara"));
System.out.println(t);
		
	}

}
