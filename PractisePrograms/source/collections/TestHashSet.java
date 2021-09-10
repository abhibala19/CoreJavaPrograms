package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestHashSet {

	public static void main(String[] args) {
		Set h=new HashSet();
		h.add("kamal");
		h.add("Rajini");
		h.add("ajay");
		h.add("vijay");
		h.add("karthik");
		h.add("suriya");
			System.out.println(h);
			Set s=new LinkedHashSet();
			s.add("jothika");
			s.add("kajal");
			s.add("nayan");
			s.add("Simran");
			s.add("meena");
			System.out.println(s);
			Set a=new TreeSet();
			a.add("vadivel");
			a.add("vivek");
			a.add("Santhanam");
			System.out.println(a);
	}

}
