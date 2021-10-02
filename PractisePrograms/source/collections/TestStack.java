package collections;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedListStack s=new LinkedListStack();
s.push("one");
s.push("two");
s.push("three");
s.push("four");s.printElements();
System.out.println(s.isEmpty());
System.out.println(s.size());

System.out.println(s.peek());
System.out.println(s.pop());
s.printElements();
	}

}
