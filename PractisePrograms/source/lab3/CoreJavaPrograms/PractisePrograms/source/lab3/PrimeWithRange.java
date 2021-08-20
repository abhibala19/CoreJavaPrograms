package CoreJavaPrograms.PractisePrograms.source.lab3;
public class PrimeWithRange
{
    public static void main(String[] args)
    {
        findPrimeWithRange(100);
    }
    public static void findPrimeWithRange(int num)
    {
        for(int i=1;i<=num;i++)
        {
            String b=Prime.isPrime(i);
            if(b=="yes")
            {
                System.out.println("the prime numbers are " +i);
            }
        }
    }
}