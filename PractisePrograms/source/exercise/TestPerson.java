package exercise;

public class TestPerson {
public static void main(String[] args) {
	Person p=new Person();
	System.out.println(p.checkIsCloneable(p));
	Metro m=new Metro();
m.standInQueue(p);
p.checkGoingInMetro(m);
}
}
