package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class Animal1 {
	private String name;
	public Animal1() {
		// TODO Auto-generated constructor stub
	}
public void setName(String s)
{
    if(s==null || s.trim().equals(""))
    {
        System.out.println("give valid name for the animal");
    }
    else
    name=s;
}
public String getName()
{
    return name;
}
public void dance()
{
	System.out.println("i am "+name+" dancing for my favourite song");
}
public void eat()
{
    System.out.println("i am animal "+name +" eating ");
}
public void sleep()
{
    System.out.println("i am animal "+name +" sleeping with eyes closed and snoring");
}
public Animal1(String c)
{
    name=c;
    System.out.println("in animal constr");

}



}
