package CoreJavaPrograms.PractisePrograms.source.lab3;
public class Gcf
{
    public static void main(String[] args)
    {
       int n= findGcf(456,45);
        System.out.println("the gcf of given no is"+n);
    }
    public static int findGcf(int n,int n1)
    {
        if(n==n1)
        return n;
         int larger=(n>n1?n:n1);
         int smaller=(n<n1?n:n1);
       // System.out.println(smaller);
        if(larger%smaller==1)
        return 1;
        for(int i=0;i<larger;i++)
        {
            int remainder=larger%smaller;
            if(remainder==0)
             return smaller;
            if (remainder==1)
            return 1;
            larger=smaller;
            smaller=remainder;
        }


        return 0;
    }
}