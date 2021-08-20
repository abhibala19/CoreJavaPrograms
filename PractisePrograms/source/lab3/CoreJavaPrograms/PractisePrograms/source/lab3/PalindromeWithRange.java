package CoreJavaPrograms.PractisePrograms.source.lab3;
public class PalindromeWithRange
{
    public static void main(String[] args)
    {
        findPalindromeWithRange(10,100000);

    }
    public static void findPalindromeWithRange(int from,int to)
    {
        for(int i=from;i<=to;i++)
        {
            String s=Palindrome.isPalindrome(i);
            if(s=="yes")
            System.out.println(i);

        }
    }
}