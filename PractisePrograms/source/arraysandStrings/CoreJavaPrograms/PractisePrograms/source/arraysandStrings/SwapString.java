package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;

public class SwapString
{
    public static void  main(String[] args)
    {
        String s1="asdf";
        String s2="abcder";
        s1=s1+s2;
        s2=s1.substring(0,(s1.length()-s2.length()));
         s1=s1.substring(s2.length(),s1.length());
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);

    }
}