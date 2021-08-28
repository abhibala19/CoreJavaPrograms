package coreJavaPrograms.PractisePrograms.source.lab7;
public class T
{
    int p=40;
     private static int val=10;
    public static int getVal()
    {
        return val;
    }
    public T()
    {
        val++;
    }
    public void test()
    {
        System.out.println(T.val);

    }
}