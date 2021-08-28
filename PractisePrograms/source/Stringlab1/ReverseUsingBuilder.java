package Stringlab1;
public class ReverseUsingBuilder
{
    public static void main(String[] args)
    {
       String a= stringReverse(args[0]);
       System.out.println("reversed string is "+a);
    }
    public static String stringReverse(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}