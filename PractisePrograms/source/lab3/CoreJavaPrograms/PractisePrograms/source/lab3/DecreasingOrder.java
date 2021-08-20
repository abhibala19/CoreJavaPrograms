package CoreJavaPrograms.PractisePrograms.source.lab3;
public class DecreasingOrder
{
    public static void main(String[] args)
    {
         String b=isDecreasingOrder(754);
         System.out.println("is the number is decreasing order "+ b);
    }
    public static String isDecreasingOrder(int num)
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
                if(remainder1>=remainder2)
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