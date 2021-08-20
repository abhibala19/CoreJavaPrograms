package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class SecondHighestValue
{
    public static void main(String[] args)
    {
        int[] a1={20,30,40,112,989};
        int[] a2={10,20,30,70,80,900};
        int b=findSecondMaxOfTwoArray(a1,a2);
        System.out.println("thw second maximum value from the two int array is "+b);

    }
    public static int findSecondMaxOfTwoArray(int[] i1,int[] i2)
    {
        int n1=MaxValueOfTwoArray.findMaxOfArray(i1);
        int n2=MaxValueOfTwoArray.findMaxOfArray(i2);
        if(n1>n2)
        {
            return n2;
        }
        else
        {
            return n1;
        }
        
    }
}