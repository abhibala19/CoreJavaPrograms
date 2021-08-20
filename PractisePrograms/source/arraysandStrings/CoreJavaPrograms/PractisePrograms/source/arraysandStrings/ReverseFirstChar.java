package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class ReverseFirstChar
{
    public static void main(String[] args)
    {
        String s="monday";
        String s1=s.substring(0,1);
        String s2=s.substring(1,s.length());
        s=s2+s1;
        System.out.println(s);
    }
}