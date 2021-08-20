package CoreJavaPrograms.PractisePrograms.source.lab1;
public class Test
{
    public static void process(int a)
    {
        System.out.println("in process method"+a);
        a=35;
        System.out.println("in process method"+a);
    
    }
    public static void main(String[] args)
    {
        int x=10;
        System.out.println();
        System.out.println("x before process caliing"+x);
        process(x);
        System.out.println("x after process caliing"+x);

    }
}