package coreJavaPrograms.PractisePrograms.source.lab5;
public class ArrayPgrm1
{
    public static void main(String[] args)
    {
        int[] ar=new int[10];
        int[] ar1={10,20,30,40};
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=i+1;
            System.out.println("the value in  "+i+" index is "+ar[i]);
        }
        for(int x:ar1)
        {
            System.out.println(x);

        }
    }
}