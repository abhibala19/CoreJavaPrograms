package lab9;

public class Man {

	private String name;
	private Woman wife;

 public void setName1(String name)
 {	if (name == null || name.trim().equals("")) {
		throw new IllegalArgumentException("give proper name to the man");
	} else
		this.name = name;
	 
 }
 public String getName()
 {
	 return name;
 }
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
			System.out.println("hey she is going to be my wife " + wife.getName());
		} else
			System.out.println("i am bacholor ");
	}

	}
