package coreJavaPrograms.PractisePrograms.source;
public class IntToOctal
{
    public static void main(String[] args)
    {
        convertToOctal(1456);
        convertToDecimal(2660);

    }
    public static void convertToOctal(int num)
    {
        int[] arr=new int[32];
        for(int i=0;num>0;i++)
        {
            arr[i]=num%8;
            num=num/8;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
    public static void convertToDecimal(int num)
    {
        int[] arr=new int[32];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=num%10;
            num=num/10;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}