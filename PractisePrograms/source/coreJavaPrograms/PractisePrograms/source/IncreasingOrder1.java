package coreJavaPrograms.PractisePrograms.source;
public class IncreasingOrder1
{
    public static void main(String[] args)
    {
        findIncreasingOrder(0001,9999);
    }
    public static void findIncreasingOrder(int from,int to)
    {
        int count=0;
        for(int i=from;i<=to;i++)
        {
            int remainder1=from%10;
            from=from/10;
            for(int j=0;j>i;j++)
            {
                int remainder2=from%10;
                if(remainder1<=remainder2)
                {
                    i++;
                }
                remainder1=remainder2;
                i++;
                count=count+1;
                System.out.println(i);

            }
                System.out.print(count);


        }
    }
}