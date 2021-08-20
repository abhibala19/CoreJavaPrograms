package CoreJavaPrograms.PractisePrograms.source.lab3;
public class DivisibleBy3
{
    public static void main(String[] args )
    { 
        int n=-234;
      boolean b =isDivisibleBy3(n);
      System.out.println(" Is the number Divisible by 3 "+b );
    }
    public static boolean isDivisibleBy3(int num)
    {
        if (num<0)
        {
            num=-num;
        }
        if(num%3==0)
        {
            return true;
        }             
        else
        return false;

    }
}