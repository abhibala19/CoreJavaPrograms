package coreJavaPrograms.PractisePrograms.source.lab5;
public class UseOf2DArray
{
    public static void main(String[] args)
    {
        int[] a1=new int[2];
        int[][] a=new int[3][a1.length];
        a1[0]=40;
        a1[1]=50;
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a1.length;j++)
            {
                a[i][j]=a1[j];
                System.out.println("element in 2d array is "+i+" , "+j+" is "+a[i][j]);
            }
        } 
    }
}