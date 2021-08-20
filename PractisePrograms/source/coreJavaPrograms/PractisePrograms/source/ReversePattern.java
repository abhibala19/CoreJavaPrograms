package coreJavaPrograms.PractisePrograms.source;
public class ReversePattern
{
    public static void main(String[] args)
    {
        reversePattern(1);
    }
    public static void reversePattern(int num)
    {
        for(int i=num;i>=1;i--)
        {
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
            

        }

            System.out.println();
            
        }
    }
}