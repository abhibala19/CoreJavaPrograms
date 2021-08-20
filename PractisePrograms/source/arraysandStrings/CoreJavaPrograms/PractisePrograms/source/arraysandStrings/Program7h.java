package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class Program7h
{
    public static void main(String[] args)
    {
        int a=args[0].compareTo(args[1]);
        if(a==0)
        {
            System.out.println("is equal");
        }
        if(a>0)
        {
            System.out.println("firstString is bigger");
        }
        if(a<0)
        {
            System.out.println("secondString is bigger");
        }
    }
}