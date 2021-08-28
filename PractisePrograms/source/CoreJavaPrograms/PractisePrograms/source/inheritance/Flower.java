package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Flower {
    private String name;
    public void setName(String s)
    {
        if(s==null || s.trim().equals(""))
        {
            System.out.println("give valid flower  name");
        }
        else{
            name=s;
        }
    }
    public String getName()
    {
        return name;
    }
    public Flower(String a)
    {
        if(a!=null && !a.equals(""))
        name=a;
        System.out.println("in flower parameter constr");

    }
  
    
}
