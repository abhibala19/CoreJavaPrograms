
package exercise;

public class B extends A {
	String a="gomu";
	public void test() {
		String a = "ramu";

		System.out.println(this.a);
		System.out.println(super.a);

	}

	public static void main(String[] args) {
		B b = new B();
		b.test();
	}

}
