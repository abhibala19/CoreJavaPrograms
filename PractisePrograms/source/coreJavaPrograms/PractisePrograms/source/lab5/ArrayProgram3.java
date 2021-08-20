package coreJavaPrograms.PractisePrograms.source.lab5;
public class ArrayProgram3
{
    public static void main(String[] args)
    {
        int[] ar=new int[10];
        for(int i=0;i<ar.length;i++)
        {
            double d=Math.random();
            ar[i]=(int)(d*10);
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