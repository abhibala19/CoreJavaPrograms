package coreJavaPrograms.PractisePrograms.source.lab5;
public class ArrayProgram4
{
    public static void main(String[] args)
    {
        int[] i={10,20,30,40};
        test(i);
    }
    public static void test(int[] ar)
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.println(" the value in "+i+" i th index is "+ar[i]);
        }
        for(int x:ar)
        {
            System.out.println(x);
        }
    }
}