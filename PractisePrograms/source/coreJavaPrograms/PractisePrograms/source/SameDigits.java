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
        int num1=SumOfDigit.findSumOfDigit(greater);
        int num2=SumOfDigit.findSumOfDigit(smaller);
        if(num1!=num2)
        {
            return "no";
        }
        for(int i=1;num1>0;i++)
        {
            int remainder1=num1%10;
            for(int j=0;num2>0;j++)
            {
            int remainder2=num2%10;
              if(remainder1==remainder2)
                {
                    num1=num1/10;

                }
              else
            	  num2=num2/10;
               
            }
            num1=num1/10;

        }
        
        if((num1==0)&&(num2==0))
        return "yes";
        else
        return "no";
    }
}