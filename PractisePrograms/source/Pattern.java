public class Pattern
{
    public static void main(String[] args)
    {
        pattern(3);
    }
    public static void pattern(int num)
    {
        for(int i=1;i<=num;i++)
        {
            
            for(int n=num-i;n>0;n--)
            {
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
 
                System.out.print("* ");
            }
                System.out.println();


        }
        
    }

}