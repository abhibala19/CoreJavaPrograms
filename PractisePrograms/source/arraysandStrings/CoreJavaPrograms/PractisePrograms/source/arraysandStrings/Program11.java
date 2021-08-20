package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class Program11
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
        double n1=findAverageOfArray(i1);
        double n2=findAverageOfArray(i2);
        double averageOfTwo=(n1+n2)/2;
        return averageOfTwo;
        
    }
    public static double findAverageOfArray(int[] a)
    {
        double sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
         return (sum/a.length);
    
    }
}