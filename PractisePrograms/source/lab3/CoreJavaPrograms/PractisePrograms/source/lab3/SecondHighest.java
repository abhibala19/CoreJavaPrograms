package CoreJavaPrograms.PractisePrograms.source.lab3;
public class SecondHighest
{
    public static void main(String[] args)
    {
        int n=findSecondHighest(20,30,40);
        System.out.println("the second highest number is "+n);
    }
    public static int findSecondHighest(int num1,int num2,int num3)
    { 
        int greater,smaller,secondGreater;
        if(num1>num2)
        {
             greater=num1;
            smaller=num2;
        }
        else 
        {
            smaller=num1;
            greater=num2;
        }
        if(smaller>num3)
        {
             secondGreater=smaller;
           smaller=num3;
        }
        else
        {
            secondGreater=num3; 
        }
        if(greater>secondGreater)
        {
            return secondGreater;
        }
        else{
            return greater;
        }
    }
}