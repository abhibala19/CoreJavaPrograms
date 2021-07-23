public class Bit
{
    public static void main(String[] args)
    {
        int b=findNoOfBits(4);
        System.out.println("the no of bits is "+b);
    }
    public static int findNoOfBits(int num)
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