public class Swap
{
    public static void main(String[] args)
    {
        doSwap(56,89);
        doSwap(556,89);
        doSwap(516,829);
        doSwap(-56,891);
        doSwap(56,89);
    }
    public static void doSwap(int a,int b)
    {
        System.out.println("before swap "+a+" and "+b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("after swap "+a+" and "+b);
    }
}