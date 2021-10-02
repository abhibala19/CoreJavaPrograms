package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class TestVehicle {
public static void main(String[] args) {
	Vehicle v=new Vehicle("scooter", 123);
	Vehicle v2=new Vehicle("scooter",123);
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
	
	
	
}
}
