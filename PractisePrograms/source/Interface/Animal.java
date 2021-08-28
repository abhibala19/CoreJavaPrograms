package Interface;

public abstract class Animal {
	String name;

	   public Animal()
	   {
		   System.out.println("in animal class no arg constr ");
	   }  
	   public Animal(String s)
	   {
		   name=s;
		   System.out.println("in animal class  paramerterized constr ");
	   }

	public abstract void eat();
	public void sleep()
	{
		System.out.println("i am animal "+name+" sleeping by keeping eyes closed ");
	}

}
class Croc extends Animal
{
	public void sleep()
	{
		System.out.println("i am croc "+name+" sleeping by keeping eyes open ");
	}

	public void swim()
	{
		System.out.println("i am croc "+name+" swimming");
	}
	public Croc()
	{
		System.out.println("in croc noarg constr");
	}
	public Croc(String s)
	{
		super(s);
		System.out.println("in Croc parameter constr");
	}
	public void eat()
	{
		System.out.println("in croc eat method is overrided");
	}
	
	
}
