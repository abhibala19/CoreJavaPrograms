package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Animal {
    private String name;
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
    public void eat()
    {
        System.out.println("i am animal "+name +" eating ");
    }
    public void sleep()
    {
        System.out.println("i am animal "+name +" sleeping with eyes closed");
    }
    public Animal(String c)
    {
        name=c;
        System.out.println("in animal constr");

    }
    
}
