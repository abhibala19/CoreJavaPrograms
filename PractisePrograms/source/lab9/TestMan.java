package lab9;

public class TestMan {
public static void main(String[] args) {
	Man m=new Man("ramu");
	m.informAboutSpouse();
	Woman w=new Woman("seetha");
	m.informAboutSpouse();
	m.marry(w);
	
	m.informAboutSpouse();
	m.divorse(w);
	m.informAboutSpouse();
}
}
