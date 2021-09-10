package lab8;

public class TestStack {
public static void main(String[] args) {
	IntStack i=new IntStack();
	i.push(20);
	i.push(90);
	i.push(70);
	i.push(30);
	i.push(90);
	i.push(204);
	i.push(60);
	i.printValue();
	System.out.println(i.pop());
	i.printValue();


}
}
