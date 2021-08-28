package Stringlab1;
public class PalindromeInString
{
    public static void main(String[] args)
    {
        boolean b=isPalindrome("madam");
        System.out.println("is the given string is palindrome "+b);
    }
    public static boolean isPalindrome(String s)
    {
       String a=Reverse1.findReverse(s);
        if(a.equals(s))
        {
            return true;
        }
        return false;
    }
}