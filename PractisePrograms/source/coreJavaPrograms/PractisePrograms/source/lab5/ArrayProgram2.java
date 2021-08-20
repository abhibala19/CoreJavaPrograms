package coreJavaPrograms.PractisePrograms.source.lab5;
public class ArrayProgram2
{
    public static void main(String[] args)
    {
        int[] ar=new int[10];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=10-i;
        }
        for (int j=0;j<ar.length;j++)
        {
            System.out.println("the value in "+j+" index is "+ar[j]);
        }
        for(int x:ar)
        {
            System.out.println(x);
        }
    }
}