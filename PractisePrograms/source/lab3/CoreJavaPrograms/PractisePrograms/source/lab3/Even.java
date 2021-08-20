package CoreJavaPrograms.PractisePrograms.source.lab3;
public class Even
{
    public static void main(String[] args )
    { 
        int n=234;
      boolean b =isEven(n);
      boolean c=isEvenUsingBitwise(n);
      System.out.println(" Is the number even "+b );
      System.out.println(" Is the number even "+b );
    }
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }             
        else
        return false;

    }
    public static boolean isEvenUsingBitwise(int num)
    {
        if((num&1)==0)
        {
            return true;
        }
        else
        return false;
    }
}