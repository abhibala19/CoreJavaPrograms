package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class Program7d
{
    public static void main(String[] args)
    {
        for(int i=0;i<(args[0].length());i++)
        {
            char c=args[0].charAt(i);
            System.out.println("the char at the index "+i+" is "+c);
        }
    }
}