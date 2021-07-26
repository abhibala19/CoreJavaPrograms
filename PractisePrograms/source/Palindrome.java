public class Palindrome
{
    public static void main(String[] args)
    {
        String s=isPalindrome(11211);
        System.out.println("the given np ispalindrom"+s);
    }
    public static String isPalindrome(int num)
    {
        if(num<0)
        return "no";
        int  r=0;int newnum=0;int n1=num;
        for(int i=0;i<num;i++)
        {
            r=num%10;
            newnum=(newnum+r)*10;
            num=num/10;
        }
         r=num%10;
            newnum=newnum+r;

            if(n1==newnum)
            return "yes";
            else 
            return "no";
    
    }
}