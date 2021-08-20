package coreJavaPrograms.PractisePrograms.source.lab5;
public class AverageOfTwoArray
{
    public static void main(String[] args)
    {
        int[] a1={20,30,40,70};
        int[] a2={10,20,30};
        double b=findAverageOfTwoArray(a1,a2);
        System.out.println("thw average of two int array is "+b);

    }
    public static double findAverageOfTwoArray(int[] i1,int[] i2)
    {
        double n1=findSumOfArray(i1);
        double n2=findSumOfArray(i2);
        double averageOfTwo=(n1+n2)/(i1.length+i2.length);
        return averageOfTwo;
    }
    public static double findSumOfArray(int[] a)
    {
        double sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
         return sum;
    
    }
}