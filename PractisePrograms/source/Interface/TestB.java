package Interface;

public class TestB {
public static void main(String[] args) {
	C obj1=new C("rose");
	B obj2=new B("pink"); 
	System.out.println("obj1 points to the obj "+ obj1.name);
	System.out.println("obj2 points to the obj "+ obj2.name);
	obj1.print();
	obj2.print();
	B.print();
	C.print();
}
}
