package lab9;

public class MobilePhone extends Phone {
	public void doSomething() {
		System.out.println("doing something in mobilephone");
	}

	public void call(String num) {
		System.out.println("making a call to the given number " + num);
	}

	public MobilePhone() {
		System.out.println("in mobile phone no arg constr"); // TODO Auto-generated constructor stub
	}
}
