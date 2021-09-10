package exercise;

public class TestConstructor {
public static void main(String[] args) {
	ReuseConstructor r=new ReuseConstructor("raara",45);
	ReuseConstructor r1=new ReuseConstructor("rasu");
	System.out.println(r.age);
	System.out.println(r.name);
	System.out.println(r1.age);


}
}
