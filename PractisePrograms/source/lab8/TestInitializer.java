package lab8;

public class TestInitializer {
		public static void main(String[] args) {
			System.out.println("in static init "+UseOfInitializer.x);
			UseOfInitializer i=new UseOfInitializer();
			System.out.println(i.x);
		}
	
}
								