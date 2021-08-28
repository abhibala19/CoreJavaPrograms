package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Tv extends Device
{
    public Tv()
    {
        System.out.println("no arg consrtuctor in tv class");
    }
    public Tv(String s)
    {
        super(s);
    }
    public void doSomething()
    {
        System.out.println("in tv class overridden method "+getName());
    }
    public void switchChannel()
    {
        System.out.println("in tv switch channel");
    }
}

