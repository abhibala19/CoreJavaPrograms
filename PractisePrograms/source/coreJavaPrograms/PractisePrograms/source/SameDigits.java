package coreJavaPrograms.PractisePrograms.source;
import CoreJavaPrograms.PractisePrograms.source.lab3.SumOfDigit;

public class SameDigits
{
    public static void main(String[] args)
    {
        String s= isSameDigits(321,123);
        System.out.println(s);
    }
    public static String isSameDigits(int greater,int smaller)
    {
        int sum1=SumOfDigit.findSumOfDigit(greater);
        int sum2=SumOfDigit.findSumOfDigit(smaller);
        if(sum1!=sum2)
        {
            return "no";
        }
        int num1=(greater>smaller?greater:smaller);
         int num2=(greater<smaller?greater:smaller);
        System.out.println(num1+""+num2);
        for(int i=1;num1>0;i++)
        {
            for(int j=0;num2>0;j++)
            {
            int remainder1=num1%10;
            int remainder2=num2%10;
              if(remainder1==remainder2)
                {
                    num2=num2/10;
                     num1=num1/10;

                }
               else
               {
                 num2=num2/10;
                if(num2==0)
                return "no";
               }
            }
        }
        
        if((num1==0)&&(num2==0))
        return "yes";
        else
        return "no";
    }
}