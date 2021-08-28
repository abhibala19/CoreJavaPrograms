package Stringlab1;
public class Reverse
{
    public static void main(String[] args)
    {
        
        findReverse(args[0]);
    }


    public static void findReverse(String d)
    {
        String s=d.trim();
        if(s==null)
        {
            System.out.println("emptyString");
        }

        char[] ca=s.toCharArray();
        for(int i=0;i<ca.length/2;i++)
        {
            ca[i]=(char)(ca[ca.length-i-1]^ca[i]);
            ca[ca.length-i-1]=(char)(ca[ca.length-i-1]^ca[i]);
            ca[i]=(char)(ca[ca.length-i-1]^ca[i]);
        }
        s=new String(ca);
        System.out.println(s);
    }
}