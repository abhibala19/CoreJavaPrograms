package Collection2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TestVehicle {
public static void main(String[] args) {
	Vehicle v=new Vehicle("scooter", 123);
	Vehicle v2=new Vehicle("scooter",123);
	Vehicle v3=new Vehicle("bike",234);
	Vehicle v4=new Vehicle("car",45);
	System.out.println(v==v2);
	System.out.println(v.equals(v2));
	ArrayList a=new ArrayList();
	System.out.println(a.add(v2));
	System.out.println(a.contains(v2));
	HashSet h=new HashSet();
	System.out.println(h.add(v));
	System.out.println(h.add(v2));
	System.out.println(v.hashCode());
	System.out.println(v2.hashCode());
	TreeSet t=new TreeSet();
	t.add(v);
	t.add(v2);
	t.add(v3);
	t.add(v4);
	System.out.println(t);
	
}
}
