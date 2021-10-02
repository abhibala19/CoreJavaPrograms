package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAgeDescendingComparator a1=new StudentAgeDescendingComparator();
		StudentNameComparator n=new StudentNameComparator();
		Student s1=new Student("anbu","id001",8);
		Student s2=new Student("siva","id002",56);
		Student s3=new Student("dani","id003",455);
		Student s4=new Student("mali","id004",547);
		Student s5=new Student("dinesh","id008",447);
		Student s6=new Student("anbus","id0051",5);
		ArrayList a=new ArrayList();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
//		System.out.println(a);
		HashSet h=new HashSet();
		h.add(s1);
		h.add(s2);
		h.add(s3);
		h.add(s4);
		h.add(s5);
//		System.out.println(h);
		LinkedHashSet l=new LinkedHashSet();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		Collections.sort(a,a1);
		System.out.println(a);
//		System.out.println(l);
		TreeSet t=new TreeSet(a1);
		TreeSet t1=new TreeSet(n);
//sorted based on agein /descendingorder
		t.add(s1);	
		t.add(s2);	
		t.add(s3);	
		t.add(s4);	
		t.add(s5);	
System.out.println(t);
//sorted based on name
t1.add(s1);	
t1.add(s2);	
t1.add(s3);	
t1.add(s4);	
t1.add(s5);	
System.out.println(t1);

	}

}
