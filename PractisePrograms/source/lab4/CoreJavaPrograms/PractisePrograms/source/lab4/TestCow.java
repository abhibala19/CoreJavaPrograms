package CoreJavaPrograms.PractisePrograms.source.lab4;
public class TestCow
{
    public static void main(String[] args)
    {
        Cow c1;
        Cow c2;
       
        c1=new Cow();
        c1.setName("lakshmi");
        c2=c1;
        // c1.moo();
        c2.setName("balu");
        c2.moo();


    }
}