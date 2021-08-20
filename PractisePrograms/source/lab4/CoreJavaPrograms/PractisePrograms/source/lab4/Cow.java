package CoreJavaPrograms.PractisePrograms.source.lab4;
public class Cow
{
    private String name;
    public void setName(String s)
    {
    	if(s==null&& s.trim().equals(""))
    	{
    		System.out.println("give valid name");
    	}
    	else
    		name=s;
    }
    public String getName()
    {
    	return name;
    }
    public void moo()
    {
        System.out.println("my name is "+name);
    }
}