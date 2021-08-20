package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Pattern1
{
    public static void main(String[] args)
    {
        findPattern(5);
    }
    public static void findPattern(int num)
    {
        for(int i=0;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();


        }
    }
}