package CoreJavaPrograms.PractisePrograms.source.inheritance;

public class MicroWave extends Device
{
    public MicroWave()
    {
        System.out.println("in microwave no arg constr");
    }
    public MicroWave(String s)
    {
        super(s);
    }
    public void doSomething()
    {
        System.out.println("a device "+getName()+" overidden method in microwave");
    }
}