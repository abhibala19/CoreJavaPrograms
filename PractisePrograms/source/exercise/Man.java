package exercise;

public class Man {
	private String name;
	 Woman wife;

	
	public Man(String s) {
		name = s;
	}

	public void marry(Woman w) {
		if (w != null && w.husband == null && wife == null) {
			wife = w;
		} else
			throw new IllegalArgumentException("ei are you already married ah");
	}

	public void divorse(Woman m) {
		wife = null;
		m.husband = null;
	}

	public void informAboutSpouse() {
		if (wife != null) {
			System.out.println("hey she is going to be my wife " + wife.name);
		} else
			System.out.println("i am bacholor ");
	}

	
}
