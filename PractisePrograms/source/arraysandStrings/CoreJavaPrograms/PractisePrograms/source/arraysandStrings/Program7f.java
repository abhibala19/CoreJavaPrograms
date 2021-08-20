package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class Program7f
{
    public static void main(String[] args)
    {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<(args[0].length());i++)
        {
            char c=args[0].charAt(i);
            if(i%2!=0)
            {
                sb1=sb1.append(c);
            } 
            else
            sb2=sb2.append(c);
        }
        System.out.println(sb1);
        System.out.println(sb2);
        
    }
}