package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Test2x
{
    public static void main(String[] args)
    {
        System.out.println("in main method");
        process();
        System.out.println("in main method after invoking");

    }
    public static void process()
    {
        System.out.println("in process method");
        process1();
    }
    public static void process1()
    {
        System.out.println("in process1 method");
        Test2.z();
    }
}