package coreJavaPrograms.PractisePrograms.source;
public class Pattern4
{
    public static void main(String[] args)
    {
        pattern(3);
    }
    public static void pattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
 
                System.out.print("* ");
            }
            for(int n=num-i;n>0;n--)
            {
                 System.out.print(" ");
            }
                System.out.println();


        }
        
    }

}