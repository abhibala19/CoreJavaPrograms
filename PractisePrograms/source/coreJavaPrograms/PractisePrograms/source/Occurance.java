package coreJavaPrograms.PractisePrograms.source;
public class Occurance
{
    public static void main(String[] args)
    {
        int n=findOccurance(1,1231112);
        System.out.println(n);
    }
    public static int findOccurance(int num1,int num2)
    {
        int num;
        int digit;
        
        if(num1<10)
        {
          num=num2;
          digit=num1; 
        }
        else
        {
        digit=num2;
           num=num1;
        }
        if(num<0)
         return 0;
        if(num==digit)
        {
            return 1;
        }
        int count=0;
        for(int i=0;num>0;i++)
        {
            int remainder=num%10;
            if(remainder==digit)
            count=count+1;
            num=num/10;
        }
        return count;
    }
}