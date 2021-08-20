package CoreJavaPrograms.PractisePrograms.source.lab3;
public class SameDigit
{
    public static void main(String[] args)
    {
        String s=isSameDigit(-224);
        System.out.println("is the given number contains same digits "+s);
    }
    public static String isSameDigit(int num)
    {
        if(num<0)
        {
            num=-num;
        }
        for(int i=0;i<=num;i++)
        {
            int remainder1=num%10;
            num=num/10;
            for(int j=0;j<=num;j++)
            {
                int remainder2=num%10;
                if((remainder1>remainder2)||(remainder1<remainder2))
                {
                    return "no";
                }
                remainder1=remainder2;
                num=num/10;
            }
        }
        return "yes";

    }
}