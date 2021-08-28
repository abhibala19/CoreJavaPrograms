package Stringlab1;
public class ReverseFirstAndLastChar
{
    public static void main(String[] args)
    {
        String s="monday";
        String s1=s.substring(0,1);
        String s3=s.substring(s.length()-1,s.length());
        String s2=s.substring(1,s.length()-1);
        s=s3+s2+s1;
        System.out.println(s);
    }
}