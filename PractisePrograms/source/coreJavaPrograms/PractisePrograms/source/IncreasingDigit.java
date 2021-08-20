package coreJavaPrograms.PractisePrograms.source;
public class IncreasingDigit
{
    public static void main(String[] args)
    {
        boolean b=isincreasingOrder(434);
        System.out.println(b);
    }
    public static boolean isincreasingOrder(int num)
    {
        int remainder1=num%10;
        num=num/10;
        for(int i=0;num>0;i++)
        {
            int remainder2=num%10;
            if(remainder1<=remainder2)
            {
                return false;
            }
            if(remainder1>remainder2)
            {
                num=num/10;
                remainder1=remainder2;
            }
            
        }
        return true;

    }
}