package Interface;

public class TestThing {
public static void main(String[] args) {
	Thing t=new Spanner();
	Tool t3=new Spanner();
	Thing t1=new Vehicle();
	Thing t2=new TubeLight();
//	t.doSomething();
//	t1.doSomething();
//	s.doSomething();
	Person p=new Person();
	p.testThing(t1);
	p.testThing(t);
	p.testThing(t3);
	p.testThing(t2);
}
}
