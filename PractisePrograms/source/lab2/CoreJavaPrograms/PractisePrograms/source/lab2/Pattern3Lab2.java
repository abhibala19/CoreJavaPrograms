package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Pattern3Lab2
{
    public static void main(String[] args)
    {
        int n=5;
        findPattern(n);
    }
    public static void findPattern(int num)
    {
        for(int i=0;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    for(int m=0;m<=(num-i);m++)
                     {
                         System.out.print(" ");
                     }
                }
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
    }
    
}