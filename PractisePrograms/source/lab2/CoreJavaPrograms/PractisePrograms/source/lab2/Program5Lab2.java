package CoreJavaPrograms.PractisePrograms.source.lab2;
public class Program5Lab2
{
    public static void main(String[] args)
    {
        int a=100;
        isDivisible(a);
    }
    public static void isDivisible(int num)
    {
        for(int i=1;i<=99;i++)
        {
           if((i%11)!=0) 
            System.out.print(i); 
            else
            System.out.println();
     
        }
    }
}