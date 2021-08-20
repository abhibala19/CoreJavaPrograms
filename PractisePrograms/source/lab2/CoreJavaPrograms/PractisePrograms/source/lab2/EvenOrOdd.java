package CoreJavaPrograms.PractisePrograms.source.lab2;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        int n=6;
        findEvenOrOdd(n);
    }
    public static void findEvenOrOdd(int num)
    {
        if((num&1)==0)
        {
            for(int i=0;i<=num;i++)
            {
                System.out.println("Shambo");
            }
        }
        else
        {
            for(int j=0;j<=num;j++)
            {
                System.out.println("govinda");

            }
        }
    }
}