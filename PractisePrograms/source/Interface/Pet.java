package Interface;

public interface Pet {
	int X=10;
	String NAME="pingu";
void play();
}
abstract class Jaanvar implements Pet 
{
	String name;
	public Jaanvar(String s)
	{
		System.out.println(" in jaanvar constr");
		name=s;
		
	}
	public void eat()
	{
	
		System.out.println("i am jaanvar "+name+" eating");
	}

}
interface Dangerous
{
	void play();
	void attack();
}
class Snake extends Jaanvar implements Pet,Dangerous
{
	public Snake(String s)
	{
		super(s);
		System.out.println("in snake parameterized constr ");
	}
	public void attack()
	{
		System.out.println("i am snack "+name+" attacking by tail");
	}
	public void play()
	{
		System.out.println("i am snake "+name +" palying");
	}
	public void hiss()
	{
		System.out.println("i am snake "+name+" hisss hiss"); 
	}
}
class Doggie extends Jaanvar implements Pet
{
	public Doggie(String s)
	{
		super(s);
		
		System.out.println("in doggie parameterized consrtr ");
	}
	public void bark()
	{
		System.out.println("i am doggie "+name +" barking bow bow ");
	}
	public void play()
	{
		System.out.println("i am doggie "+name +"palying by catching ball");
	}
}
