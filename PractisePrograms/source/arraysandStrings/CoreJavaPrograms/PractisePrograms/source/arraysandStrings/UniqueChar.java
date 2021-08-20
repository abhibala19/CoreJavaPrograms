package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class UniqueChar
{
    public static void main(String[] args)
    {
        findUniqueChar(args[0]);
    }
    public static void findUniqueChar(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char c1=s.charAt(j);
                if(c==c1)
                {
                   count++;
                }
            }
            if(count==1)
            { 
                System.out.print(c);
            }
            count=0;
        }
    }
}