package collections;

public class TestSingleLL {
public static void main(String[] args) {
	SinglyLinkedList s=new SinglyLinkedList();
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("four");
	System.out.println(s.size());
	System.out.println(s.isEmpty());
	System.out.println(s.contains("four"));
	System.out.println(s.remove(0));
	s.insert("five",3);
s.print();	
			
}

}
