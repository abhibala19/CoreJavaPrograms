package collectionslab1;

import java.util.ArrayList;

public class PersonArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
Person p1=new Person("abhi",9);
Person p2=new Person("abhi",9);
Person p3=new Person("gomu",8);
l.add(p1);
l.add(p3);
System.out.println(l);
System.out.println(l.isEmpty());
System.out.println(l.size());
System.out.println(l.contains(p2));
System.out.println(l.contains(p3));
System.out.println(l.remove(1));
System.out.println(l);



	}

}
