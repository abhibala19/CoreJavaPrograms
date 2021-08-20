package coreJavaPrograms.PractisePrograms.source;
public class Fibnacci
{
    public static void main(String[] args)
    {
       // findFibnacci(16);
        findFibnacciTillTheNumber(16);
    }
    //number of times
    /* public static void findFibnacci(int num)
    {
        if(num<0)
        System.out.println("invalid");
        int[] arr=new int[100];
        arr[0]=0;arr[1]=1;
        for(int i=1;i<num;i++)
        {
            arr[i+1]=arr[i]+arr[i-1];

        }
        for(int i=0;i<=num;i++)
        {
            System.out.println(arr[i]);

        }
    } */
    public static void findFibnacciTillTheNumber(int num)
    {
        if(num<0)
        System.out.println("invalid");
        int previousnum=0;
        int finalnum=1;
        int sum=0;
        System.out.println(previousnum);
        for(int i=0;i<num;i++)
        {
            sum=(previousnum+finalnum);

            if(sum<=num)
            {
            previousnum=finalnum;
            finalnum=sum;
                             
             System.out.println(sum);
            }
        }
    }
    }