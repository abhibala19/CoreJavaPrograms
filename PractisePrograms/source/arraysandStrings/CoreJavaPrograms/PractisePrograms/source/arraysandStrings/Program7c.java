package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class Program7c
{
    public static void main(String[] args)
    {
        // System.out.println("the String is "+args[0]);
        int a=args[0].length();
        System.out.println("string length is= "+a);
        if((a<12)&&(a>0))
        {
            System.out.println("you have  a good name "+args[0]);
        }
        if(a>=12)
        {
            System.out.println("you have a very long name "+args[0]);
        }
        if(a==0)
        {
            System.out.println("give a name");
        }
    }
}