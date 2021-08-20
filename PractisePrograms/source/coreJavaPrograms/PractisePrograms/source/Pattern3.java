package coreJavaPrograms.PractisePrograms.source;
public class Pattern3
{
    public static void main(String[] args)
    {
        pattern3(5);
    }
    public static void pattern3(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=num-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int a=1;a<=i;a++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}