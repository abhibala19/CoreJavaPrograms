package coreJavaPrograms.PractisePrograms.source;
public class AverageCloseToNumber
{
    public static void main(String[] args)
    {
        double n=findAverageCloseToNumber(24,45,37);
        System.out.println("the number closest to the average "+ n);
    }
    public static double findAverageCloseToNumber(int a1,int b1,int c1)
    {
        double  ave=(a1+b1+c1)/3.0;
        System.out.println("average"+ave);
       double a=ave-a1;
        if(a<0)
        a=-a;
       double b=ave-b1;
        if(b<0)
        b=-b;
      double c=ave-c1;
        if(c<0)
        c=-c;   
        double smaller=0;
        double larger=0;
        double secondLarger=0;
        larger=(a>b?a:b);
        smaller=(a<b?a:b);
        larger=(larger>c?larger:c);
        secondLarger=(larger<c?larger:c);
        smaller=(smaller<secondLarger?smaller:secondLarger);
        secondLarger=(smaller>secondLarger?smaller:secondLarger);
        return smaller+ave;

        
    }
}