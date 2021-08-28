package Interface;

public interface TestInterface {
	void m1();
}

interface A1 {
	void m1(int n);

	void m2();
}

interface A2 extends TestInterface, A1 {
	void m3();
}

abstract class B1 implements A2 {@Override
public void m1(int n) {
	// TODO Auto-generated method stub
	System.out.println(" parameterized m1 method is overrided");
}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method m1 overirided");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("method m2 overirided");

	}
}

class B2 extends B1 {
	public void m3() {
		System.out.println("method m3 is overrided");
	}

}
