package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class MaxValueOfTwoArray
{
    public static void main(String[] args)
    {
        int[] a1={20,30,40,112};
        int[] a2={10,20,30,70,80,900};
        int b=findMaxOfTwoArray(a1,a2);
        System.out.println("thw maximum value from the two int array is "+b);

    }
    public static int findMaxOfTwoArray(int[] i1,int[] i2)
    {
        int n1=findMaxOfArray(i1);
        int n2=findMaxOfArray(i2);
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }
        
    }
    public static int findMaxOfArray(int[] a)
    {
        int maximum=0;
        for(int i=0;i<a.length;i++)
        {
            if(i<(a.length-1))
            {
                if(a[i]>a[i+1])
                {
                    maximum=a[i];
                }
                else
                {
                    maximum=a[i+1];
                }
            }
            else
            {
                if(a[i]>maximum)
                {
                    maximum=a[i];
                }
            }
        }
        return maximum;
    }
}