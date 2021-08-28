package taskonStrings;
public class NoOfVowel
{
    public static void main(String[] args)
    {
        int n=findNoOfVowel(args[0]);
        System.out.println(n);
    }
    public static int findNoOfVowel(String s)
    {
        char[] ca=s.toCharArray();
        int count=0;
        int countConsonent=0;
        int digit=0;
        for(int i=0;i<ca.length;i++)
        {
            if(ca[i]=='a'||ca[i]=='e'||ca[i]=='i'||ca[i]=='o'||ca[i]=='u')
            {
                count++;
            }
            else
            if(Character.isLetter(ca[i]))
            {
                countConsonent++;
            }
            if(Character.isDigit(ca[i]))
            {
                digit++;
            }
        }
        System.out.println("the number of consonent in given String is "+countConsonent);
        System.out.println("the number digit in given String is "+digit);
        return count;

    }
}