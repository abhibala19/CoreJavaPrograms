package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Printer extends Device
{
    public void doSomething()
    {
        System.out.println("a device "+getName()+ " overridden dosomething method in printer");
    }
    public Printer()
    {
        System.out.println("no arg constr in printer");
    }
    public Printer(String a)
    {
        super(a);
    }
}

