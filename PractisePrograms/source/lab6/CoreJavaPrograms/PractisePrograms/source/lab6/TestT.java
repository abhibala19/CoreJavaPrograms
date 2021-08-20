package CoreJavaPrograms.PractisePrograms.source.lab6;
public class TestT
{
    public static void main(String[] args)
    {
        System.out.println(T.getVal());
        T t1=new T();
        System.out.println(T.getVal());
        System.out.println(t1.p);
        t1.test();
        t1=null;
        System.out.println(t1.getVal());



    }
}