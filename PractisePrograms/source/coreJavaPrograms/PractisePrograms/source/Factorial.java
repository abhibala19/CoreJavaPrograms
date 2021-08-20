package coreJavaPrograms.PractisePrograms.source;
public class Factorial
{
    public static void main(String[] args)
    {
        int num = 3;
        long result = findFactorial(num);
        System.out.println("factorial of the number "+num+ " is "+result);
    }
    public static long findFactorial(int num)
    {
        int fact=1;
        for(int i=num;i>0;i--)
        {
            fact=(fact*i);
        }
        return fact;

    }
}