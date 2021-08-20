package CoreJavaPrograms.PractisePrograms.source.lab3;
public class BitSetTo1
{
    public static void main(String[] args)
    {
        int b=findNoOfBitsSetTo1(4);
        System.out.println("the no of bits is "+b);
    }
    public static int findNoOfBitsSetTo1(int num)
    {
        int c=0;
        for(int i=0;i<=num;i++)
        {
          c=c+(num%2);
          num=(num/2);
            
        }
        return c+1;
    }

}