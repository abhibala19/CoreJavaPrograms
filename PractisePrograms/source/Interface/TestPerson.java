package Interface;

public class TestPerson {
public static void main(String[] args) {
	ImmutablePerson p=new ImmutablePerson(45, "gomu");
//	p.name="haja";
	System.out.println("person name "+p.name);
	System.out.println("person age "+p.age);

}
}
