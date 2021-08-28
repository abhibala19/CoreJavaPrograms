package Interface;

public class TestArrayStack {
public static void main(String[] args) {
	ArrayStack a1=new ArrayStack();
	a1.push(5);
	a1.push(10);
	a1.push(15);
	a1.printElements();
	System.out.println();
	System.out.println(a1.count);
	System.out.println(a1.peek());
	System.out.println(a1.pop());
	System.out.println(a1.peek());
	a1.printElements();
	a1.push(20);
	a1.printElements();


}
}
