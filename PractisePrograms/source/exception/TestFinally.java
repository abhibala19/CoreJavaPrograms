package exception;

public class TestFinally {
	public static void main(String[] args) {
		try {
			TestFinally v = new TestFinally();
			int x = v.m1();
			System.out.println(x);
		} catch (Throwable t) {
			System.out.println("in main catch");
			t.printStackTrace();
		}

	}

	public int m1() {
		int x = 10;
		try {
//			String s=null;
			System.out.println("in m1 x= " + x);
//			System.out.println(s.length());
			return ++x;
		} catch (Exception e) {
//			String s=null;
			
			System.out.println("in catch ofm1 " + e.getMessage());
//			System.out.println(s.length());
			return ++x;
		} finally {
//			String s=null;
			System.out.println("in finally x = " + x);
//			System.out.println(s.length());

		}
	}
}
