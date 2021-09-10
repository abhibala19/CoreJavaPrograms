package lab9;

public class TestImmutablePerson {
public static void main(String[] args) {
	ImmutablePerson p=new ImmutablePerson(45, "gomu");
	System.out.println("person name "+p.name);
	System.out.println("person age "+p.age);

}
}
