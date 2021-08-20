package CoreJavaPrograms.PractisePrograms.source.lab3;
public class Average
{
    public static void main(String[] args)
    {
        double d=findAverage(10,20,30);
        System.out.println("the average three number "+ d);
    }
    public static double findAverage(int a,int b,int c)
    {
        double d=(a+b+c)/3;
        return d;

    }
}