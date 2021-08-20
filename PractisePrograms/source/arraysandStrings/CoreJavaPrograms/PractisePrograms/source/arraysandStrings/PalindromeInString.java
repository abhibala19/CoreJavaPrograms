package CoreJavaPrograms.PractisePrograms.source.arraysandStrings;
public class PalindromeInString
{
    public static void main(String[] args)
    {
        boolean b=isPalindrome(args[0]);
        System.out.println("is the given string is palindrome "+b);
    }
    public static boolean isPalindrome(String s)
    {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String a=sb.toString();
        if(a.equals(s))
        {
            return true;
        }
        return false;
    }
}