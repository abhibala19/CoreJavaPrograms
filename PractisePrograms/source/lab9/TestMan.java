package lab9;

public class TestMan {
public static void main(String[] args) {
	Man m=new Man("arbaz");
	Woman w=new Woman("malaika");
	Woman w2=new Woman("roise");

	m.informAboutSpouse();
	m.marry(w);
	m.marry(w2);
	
	m.informAboutSpouse();
	m.divorse(w);
	m.informAboutSpouse();
}
}
