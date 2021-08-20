package CoreJavaPrograms.PractisePrograms.source.lab3;
public class SumOfDigit
{
    public static void main(String[] args)
    {
        int n=findSumOfDigit(234);
        System.out.println(n);
    }
    public static int findSumOfDigit(int num)
    {
        if(num<0)
        {
            num=-num;
        }
        int sum=0;
        for(int i=0;num>0;i++)
        {
            int remainder=num%10;
            sum=sum+remainder;
            num=num/10;
        }
        return sum;
    }
}