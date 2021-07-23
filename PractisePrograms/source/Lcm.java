public class Lcm
{
    public static void main(String[] args)
    {
        int c=findLcm(67,89);
        System.out.println("the lcm of given num is"+c);
    }
    public static int findLcm(int a,int b)
    {
        int gcf=Gcf.findGcf(a,b);
        System.out.println("the gcf is"+gcf);
        a=a/gcf;
        b=b/gcf;
        int lcf=a*b*gcf;
        return lcf;
    }
}