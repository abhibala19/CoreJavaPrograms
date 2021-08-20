package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class GetAlternativeChar
{
    public static void main(String[] args)
    {
        String s="asdfghjkl";
        for(int i=0;i<s.length();i+=2)
        {
            char c=s.charAt(i);
            System.out.print(c);
        }
    }
}