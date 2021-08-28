package Interface;

public interface Thing {
 void doSomething();
}
class Tool implements Thing
{
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println(" a tool is doing something");
	}
}
class Spanner extends Tool{
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
	System.out.println("in spanner dosomething is overrided");
	}
}
class TubeLight implements Thing
{
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println(" i am rendering light when i ask me to dosomething");
	}
}
class Vehicle implements Thing
{@Override
public void doSomething() {
	// TODO Auto-generated method stub
	System.out.println("i am vehicle drivind towards destination");
}
	
}
