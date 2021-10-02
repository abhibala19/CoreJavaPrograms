package exercise;

public class Atom {
public Atom() {
	// TODO Auto-generated constructor stub
	System.out.println("in atom");
}
public static void main(String[] args) {
	new Mountain();
}
}
class Rock extends Atom
{
	public Rock(String s) {
		System.out.println(s);
	}
}
class Mountain extends Rock
{
	public Mountain() {
		// TODO Auto-generated constructor stub
		super("granite");
		new Rock("granite");
	}
}
