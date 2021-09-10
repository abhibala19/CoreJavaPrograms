package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class Vet1 {
	private String name;
	public Vet1(String s) {
		if(s==null && s.trim().equals(""))
		{
			throw new IllegalArgumentException("give proper vet name");
		}
		else
			name=s;
		// TODO Auto-generated constructor stub
	}
public void treatAnimal1(Animal1 a)
{
	a.dance();
	a.eat();
	a.sleep();
	if(a instanceof Croc)
	{
		Croc c=(Croc)a;
		 c.swim();
	}
	if(a instanceof Hippo)
	{
		Hippo h=(Hippo)a;
		h.smoke();
	}
}
}
