package Collectionlab3;

public class TestArrayStack {
public static void main(String[] args) {
	ArrayStack a=new ArrayStack();
	a.push(5);
	a.push(10);
	a.push(15);
	a.printElements();
	System.out.println(a.peek());
	System.out.println(a.pop());
	System.out.println(a.peek());
	a.printElements();
	System.out.println(a.peek());
	a.printElements();
a.push(20);
a.printElements();
}
}
