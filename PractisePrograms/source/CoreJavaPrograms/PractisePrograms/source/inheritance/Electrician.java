package CoreJavaPrograms.PractisePrograms.source.inheritance;
public class Electrician
{
    public void testDevice(Device d)
    {
        d.doSomething();
        if(d instanceof Tv)
        {
            Tv t=(Tv)d;
            t.switchChannel();
        }
    }
}