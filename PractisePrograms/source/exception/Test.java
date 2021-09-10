package exception;

public class Test {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("34");
			double d = (double)1 / 0;
			System.out.println(d);
			System.out.println(i);
			System.out.println(args[0]);

		}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("you accessing non existing index");
			a.printStackTrace();

		} catch (NumberFormatException t) {
			System.out.println("give valid number string can not be converted to int");
			t.printStackTrace();
		} catch (Throwable t) {
			System.out.println(" in theowable class");
			t.printStackTrace();

		}

		System.out.println("in main after catch");
	}

}
