package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class TestTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthComparator s=new StringLengthComparator();
List<String> l=new ArrayList<String>();		
Set<String> t=new TreeSet<String>(s);
String s1="balaji";
String s2="namfja";
String s3="abirami";
String s4="sandhiya";
String s5="sundariskm";
String s6="sampathppavanthur";
String s7="ABHINAYAs";
t.add(s1);
t.add(s2);
t.add(s3);
t.add(s4);
t.add(s5);
t.add(s6);
t.add(s7);
System.out.println(t);
l.add(s1);
l.add(s7);
l.add(s2);
l.add(s3);
l.add(s4);
l.add(s5);
l.add(s6);
l.add(s7);
System.out.println(l);
Collections.sort(l);
System.out.println(l);
	}

}
