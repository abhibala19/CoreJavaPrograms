package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("before invoking");
       int x= print();
        System.out.println("after invoking");
        System.out.println("in main after invoking "+x);
    }
    public static int print()
    {
        System.out.println("in print()");
         int a=30;
        System.out.println(a);
        return a;
        

    }
}