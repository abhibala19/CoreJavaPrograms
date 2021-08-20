package CoreJavaPrograms.PractisePrograms.source.lab3;
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
        {
            num=-num;
        }
        int  r=0;int newnum=0;int n1=num;
        while(num>0)
        {
            r=r%10;
            newnum=(newnum*10)+r;
            num=num/10;
        }
            if(n1==newnum)
            return "yes";
            else 
            return "no";
    
    }
}