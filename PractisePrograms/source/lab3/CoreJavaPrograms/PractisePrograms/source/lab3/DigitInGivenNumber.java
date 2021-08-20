package CoreJavaPrograms.PractisePrograms.source.lab3;
public class DigitInGivenNumber
{
    public static void main(String[] args)
    {
       String s=isDigitInGivenNumber(2,452);
       System.out.println("is the number contains given digit "+ s);
    }
    public static String isDigitInGivenNumber(int a,int b)
    {
        int num,digit;
        if(a>9)
        {
             num=a;
             digit=b;
        }
        else
        {
            num=b;
            digit=a;
        }
        for(int i=0;i<=num;i++)
        {
            int remainder=num%10;
            if(digit==remainder)
            {
                return "yes";
            }
            num=num/10;
        }
        return "no";
    }
}