package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class CharWithoutRepetition
{
    public static void main(String[] args)
    {
        findCharWithoutRepetition(args[0]);
    }
    public static void findCharWithoutRepetition(String s)
    {
        int count=0;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                char c1=s.charAt(j);
                if(c==c1)
                {
                    count++;
                    if(count==1)
                    {
                        sb.append(c);
                    }
                    
                }
            }
            count=0;
        }
        String s1=sb.toString();
        System.out.println(s1);

    }
}