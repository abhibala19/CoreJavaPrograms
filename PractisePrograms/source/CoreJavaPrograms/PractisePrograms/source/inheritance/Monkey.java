package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class Monkey extends Animal {
    public void eat()
    {
        System.out.println("i am monkey "+getName()+" eating differently");
    }
    public void imitate()
    {
        System.out.println("i am monkey "+getName()+" imitating like others");
    }
    public Monkey(String s)
    {
        super(s);
        System.out.println("in monkey parameter constr");
    }
    
}
